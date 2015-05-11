package com.luisgoyes.practica4;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		if( findViewById(R.id.actividad_pequena) != null ){
			A_Frag_Menu fMenu = new A_Frag_Menu();
			getFragmentManager().beginTransaction().add(android.R.id.content, fMenu, null).commit();
		}
	}
	
}
