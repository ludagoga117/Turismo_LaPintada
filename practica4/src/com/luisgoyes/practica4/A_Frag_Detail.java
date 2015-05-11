package com.luisgoyes.practica4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class A_Frag_Detail extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.fragment_principal, container, false);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	public void cambiarFragmento(int n){
		switch( n ){
			case 0:
				F_hoteles f1 = new F_hoteles();
				getFragmentManager().beginTransaction().replace(android.R.id.content,  f1).addToBackStack(null).commit();
				break;
			case 1:
				F_bares f2 = new F_bares();
				getFragmentManager().beginTransaction().replace(android.R.id.content,  f2).addToBackStack(null).commit();
				break;
			case 2:
				F_turista f3 = new F_turista();
				getFragmentManager().beginTransaction().replace(android.R.id.content,  f3).addToBackStack(null).commit();
				break;
			case 3:
				F_demogra f4 = new F_demogra();
				getFragmentManager().beginTransaction().replace(android.R.id.content,  f4).addToBackStack(null).commit();
				break;
			case 4:
				F_index f5 = new F_index();
				getFragmentManager().beginTransaction().replace(android.R.id.content,  f5).addToBackStack(null).commit();
				break;
		}
	}
}
