package com.luisgoyes.practica4;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
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
		FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
		F_index f1 = new F_index();
		fragmentTransaction.add(android.R.id.content, f1).commit();
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
		F_hoteles f2 = new F_hoteles();
		getFragmentManager().beginTransaction().replace(android.R.id.content, f2).commit();
	}
	
	private void BaresMenuItem(){
		F_bares f3 = new F_bares();
		getFragmentManager().beginTransaction().replace(android.R.id.content, f3).commit();
	}
	
	private void TuristaMenuItem(){
		F_turista f4 = new F_turista();
		getFragmentManager().beginTransaction().replace(android.R.id.content, f4).commit();
	}
	
	private void DemograficaMenuItem(){
		F_demogra f5 = new F_demogra();
		getFragmentManager().beginTransaction().replace(android.R.id.content, f5).commit();
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
		new AlertDialog.Builder(this)
		.setTitle(getResources().getString(R.string.sHelp))
		.setMessage(getResources().getString(R.string.sHelpText))
		.setNeutralButton(getResources().getString(R.string.sOk), new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		}).show();
	}
}
