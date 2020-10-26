package com.example.curso3semana5mascotas.vista;

import android.content.Context;

import com.example.curso3semana5mascotas.database.ConstructorMascotas;
import com.example.curso3semana5mascotas.db.Mascotas;

import java.util.ArrayList;

public class RecyclerViewFragmentPrecenter implements IRecyclerViewFragmentPrecenter{
	
	private IRecyclerViewFragmentView iRecyclerViewFragmentView;
	private Context context;
	private ConstructorMascotas constructorMascotas;
	
	ArrayList<Mascotas> mascotas;
	
	public RecyclerViewFragmentPrecenter (IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context ) {
		this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
		this.context = context;
		obtenerMascotaBaseDatos ();
	}
	
	@Override
	public void obtenerMascotaBaseDatos() {
		constructorMascotas = new ConstructorMascotas(context);
		mascotas = constructorMascotas.obtenerMascotas();
		mostrarMascotasRv ();
	}
	
	@Override
	public void mostrarMascotasRv () {
		iRecyclerViewFragmentView.inicializarAdaptadorRv (iRecyclerViewFragmentView.crearAdaptador(mascotas));
		iRecyclerViewFragmentView.generarLinearLayoutVertical();
	}
}
