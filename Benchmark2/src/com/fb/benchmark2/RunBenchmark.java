package com.fb.benchmark2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class RunBenchmark extends Activity {
	
	long startTime,elapsedTime;
	TextView timeTV;
	
	FileInputStream fis;
	FileOutputStream fos;
	Thread bThread;
	
	private Handler myHandler = new Handler(){
		
		public void handleMessage(Message msg){
			
			String temp = msg.getData().getString("message");
			timeTV.setText(String.valueOf(temp));
		}
		
	};
	
	 private void threadMsg(String msg) {
    	 
         if (!msg.equals(null) && !msg.equals("")) {
             Message msgObj = myHandler.obtainMessage();
             Bundle b = new Bundle();
             b.putString("message", msg);
             msgObj.setData(b);
             myHandler.sendMessage(msgObj);
         }
     }

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bench_result);
		
		timeTV =  (TextView)findViewById(R.id.timeTV);
		

		bThread = new Thread(new Runnable()
		{
			@Override
			public void run() {
				try {
					//updateTV("Encrypting");
					encrypt();
				} catch (InvalidKeyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchPaddingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		bThread.setPriority(Thread.MAX_PRIORITY);
		bThread.start();
		
	}

	private void encrypt() throws IOException,NoSuchAlgorithmException,NoSuchPaddingException,InvalidKeyException{
		
		long count = 0;
		// Read plaintext
		File extStore = Environment.getExternalStorageDirectory();
		//File f = new File("file");
		
			  FileInputStream fis = new FileInputStream(extStore + "/testFile.mp4");
		
			  // This stream will write the ecrypted text and will be wrapped in
			  // another stream.
			  FileOutputStream fos = new FileOutputStream(extStore + "/testFile.aes"); 
		 

		
		// 16 byte 
		SecretKeySpec sk = new SecretKeySpec("MytoughPasswords".getBytes(),"AES");
		
		// cipher
		
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE,sk);
		
		// Wrap output stream
		startTime = System.nanoTime();
		CipherOutputStream cos = new CipherOutputStream(fos, cipher);
		
		System.out.println("Before write bytes");
		
		// Write bytes
		int b;
		//updateTV("Before Encryption");
		byte[] d = new byte[16];
		while((b = fis.read(d)) != -1)
		{
			cos.write(d,0,b);
			System.out.println(count++);
			threadMsg(d.toString());
		}
		System.out.println("After write bytes");
		elapsedTime = System.nanoTime() - startTime;
		// flush and close streams.
		
		cos.flush();
		cos.close();
		fis.close();
		fos.close();
		
		System.out.println("After file creation");
		double seconds = (double)elapsedTime / 1000000000.0;
		threadMsg(String.valueOf(seconds));
	}
	
	
	
	
}
