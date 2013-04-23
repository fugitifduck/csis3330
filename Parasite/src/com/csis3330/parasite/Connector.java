package com.csis3330.parasite;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import android.os.AsyncTask;
import android.util.Log;


public class Connector extends AsyncTask<Double, Void, Boolean>{



	@Override
	protected Boolean doInBackground(Double... params) {
		
		try {
			// TODO Auto-generated method stub
			Double longitude = params[0];
			Double latitude = params[1];
			
			String str = "http://kimsufi.duc-nguyen.com/android/test.php?long="+ longitude.toString()+"&lat="+latitude.toString();
			URL url = new URL(str); 
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setReadTimeout(10000 /* milliseconds */);
	        conn.setConnectTimeout(15000 /* milliseconds */);
	        conn.setRequestMethod("GET");
	        conn.setDoInput(true);
	        // Starts the query
	        Log.v("DEBUG", str);
	        conn.connect();
	        int response = conn.getResponseCode();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	

}
