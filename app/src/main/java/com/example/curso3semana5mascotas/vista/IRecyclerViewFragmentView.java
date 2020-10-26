package com.example.curso3semana5mascotas;

import com.example.curso3semana5mascotas.db.Mascotas;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {
	public void generarLinearLayoutVertical();
	public ContactoAdapter crearAdaptador( ArrayList< Mascotas > mascotas);
	public void inicializarAdaptadorRv(ContactoAdapter adaptador);
}
