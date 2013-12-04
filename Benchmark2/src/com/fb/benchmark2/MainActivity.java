package com.fb.benchmark2;

import java.io.IOException;
import java.util.List;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

import com.fb.benchmark2.benchresultendpoint.model.BenchResult;
import com.fb.benchmark2.benchresultendpoint.Benchresultendpoint;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.json.jackson2.JacksonFactory;



public class MainActivity extends Activity {
	
	private ListView deviceList;
	private List<BenchResult> devices = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        new ResultsTask().execute();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private class ResultsTask extends AsyncTask<Void,Void,Void> {

		@Override
		protected Void doInBackground(Void... arg0) {
			BenchResult result = new BenchResult();
			
			result.setDeviceCPU("S600");
			result.setDeviceName("HTC One");
			result.setDeviceGPU("Adreno 320");
			result.setDeviceRAM("2gb");
			result.setDeviceResult(10000);
			
			Benchresultendpoint.Builder builder = new Benchresultendpoint.Builder(
					AndroidHttp.newCompatibleTransport(),new JacksonFactory(),null);
			
			builder = CloudEndpointUtils.updateBuilder(builder);
			
			Benchresultendpoint endpoint = builder.build();
			
			try {
				endpoint.insertBenchResult(result).execute();
			}catch (IOException e){
				e.printStackTrace();
			}
			
			return null;
		}
    	
    }
    
}
