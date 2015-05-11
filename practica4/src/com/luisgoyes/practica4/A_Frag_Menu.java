package com.luisgoyes.practica4;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class A_Frag_Menu extends ListFragment{
	private final String[] opciones = new String[] {
			getResources().getString(R.string.sHotel),
			getResources().getString(R.string.sBares),
			getResources().getString(R.string.sTurista),
			getResources().getString(R.string.sDemo),
			getResources().getString(R.string.sPrincipal),
			getResources().getString(R.string.sAbout),
			getResources().getString(R.string.sHelp)
	};
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		A_Frag_Detail fragment = (A_Frag_Detail) getFragmentManager().findFragmentById(R.id.detallesFrag);
		if(fragment != null && fragment.isInLayout()){
			fragment.cambiarFragmento(position);
		}else{
			A_Frag_Detail f1 = new A_Frag_Detail();
			getFragmentManager().beginTransaction().replace(android.R.id.content, f1).addToBackStack(null).commit();
		}
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,opciones));
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.fragment_menu, container,false);
	}
	
	
}
