package com.luisgoyes.practica4;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
			case R.id.iHoteles:
				HotelesMenuItem();
				break;
			case R.id.iBares:
				BaresMenuItem();
				break;
			case R.id.iTurista:
				TuristaMenuItem();
				break;
			case R.id.iDemografica:
				DemograficaMenuItem();
				break;
			case R.id.iAbout:
				AboutMenuItem();
				break;
			case R.id.iHelp:
				HelpMenuItem();
				break;
			default:
				break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void HotelesMenuItem(){
		Intent intent = new Intent(this, HotelesActivity.class);
		startActivity(intent);
	}
	
	private void BaresMenuItem(){
		
	}
	
	private void TuristaMenuItem(){
		
	}
	
	private void DemograficaMenuItem(){
		
	}
	
	private void AboutMenuItem(){
		new AlertDialog.Builder(this)
		.setTitle(getResources().getString(R.string.sAbout))
		.setMessage(getResources().getString(R.string.sAboutInfo))
		.setNeutralButton(getResources().getString(R.string.sOk), new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		}).show();
	}
	
	private void HelpMenuItem(){
		
	}
}
