package com.example.curso3semana5mascotas.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.curso3semana5mascotas.ContactoAdapter;
import com.example.curso3semana5mascotas.vista.IRecyclerViewFragmentView;
import com.example.curso3semana5mascotas.R;
import com.example.curso3semana5mascotas.db.Mascotas;
import com.example.curso3semana5mascotas.vista.IRecyclerViewFragmentPrecenter;
import com.example.curso3semana5mascotas.vista.RecyclerViewFragmentPrecenter;

import java.util.ArrayList;


public class RecyclervVewFragment extends Fragment implements IRecyclerViewFragmentView {
	
	private ArrayList<Mascotas> mascotas;
	private RecyclerView rvMastotas;
	private IRecyclerViewFragmentPrecenter precenter;
	
	
	
	@Override
	public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View v = inflater.inflate(R.layout.fragment_recyclerv_vew, container, false);
		rvMastotas = (RecyclerView) v.findViewById (R.id.rvMascotasView);
		precenter = new RecyclerViewFragmentPrecenter (this, getContext ());
		return v;
	}
	
	@Override
	public void generarLinearLayoutVertical () {
		LinearLayoutManager llm = new LinearLayoutManager (getActivity ());
		llm.setOrientation (LinearLayoutManager.VERTICAL);
		rvMastotas.setLayoutManager (llm);
	}
	
	@Override
	public ContactoAdapter crearAdaptador (ArrayList<Mascotas> mascotas ) {
		ContactoAdapter adaptador = new ContactoAdapter (mascotas, getActivity () );
		return adaptador;
	}
	
	@Override
	public void inicializarAdaptadorRv(ContactoAdapter adaptador) {
		rvMastotas.setAdapter (adaptador);
	}
}