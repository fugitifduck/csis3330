package com.csis3330.parasite;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.maps.MapView;




public class Map extends FragmentActivity{


	private MapView map;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.map);
		
		//map = (MapView) findViewById(R.id.map);
		
		


	}


}