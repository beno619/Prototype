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
import android.widget.TextView;

public class RunBenchmark extends Activity {
	
	long startTime,elapsedTime;
	TextView timeTV;

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bench_result);
		
		
		
		try {
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
		
		timeTV.findViewById(R.id.timeTV);
		timeTV.setText(String.valueOf(elapsedTime));
	}

	private void encrypt() throws IOException,NoSuchAlgorithmException,NoSuchPaddingException,InvalidKeyException{
		
		// Read plaintext
		File extStore = Environment.getExternalStorageDirectory();
		FileInputStream fis = new FileInputStream(extStore + "/testFile.mp4");
		
		// This stream will write the ecrypted text and will be wrapped in
		// another stream.
		FileOutputStream fos = new FileOutputStream(extStore + "/encrypted"); 
		
		
		// 16 byte 
		SecretKeySpec sk = new SecretKeySpec("MytoughPassword".getBytes(),"AES");
		
		// cipher
		
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE,sk);
		
		// Wrap output stream
		startTime = System.nanoTime();
		CipherOutputStream cos = new CipherOutputStream(fos, cipher);
		
		// Write bytes
		int b;
		byte[] d = new byte[8];
		while((b = fis.read(d)) != -1){
			cos.write(d,0,b);
		}
		
		elapsedTime = System.nanoTime() - startTime;
		// flush and close streams.
		cos.flush();
		cos.close();
		fis.close();
	}
		

	
}
