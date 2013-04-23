package com.csis3330.parasite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Welcome_Screen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome__screen);
		
	}

	public void updateLoc(View view) {
		Intent intent = new Intent(this, LocUpdate.class);
		startActivity(intent);
	}
	
	public void map(View view) {
		Intent intent = new Intent(this, Map.class);
		startActivity(intent);
	}	

	public void register(View view) {
		
	}
	
	
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome__screen, menu);
		return true;
	}

	
	
	//comment 2
}
