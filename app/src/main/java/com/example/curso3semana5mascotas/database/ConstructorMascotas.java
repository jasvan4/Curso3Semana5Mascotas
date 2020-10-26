package com.example.curso3semana5mascotas.database;

import android.content.ContentValues;
import android.content.Context;

import com.example.curso3semana5mascotas.R;
import com.example.curso3semana5mascotas.db.Mascotas;

import java.util.ArrayList;

public class ConstructorMascotas {
	private static final int LIKE = 1;
	private Context contexto;
	
	public ConstructorMascotas(Context context){
		this.contexto = context;
	}
	
	public ArrayList<Mascotas> obtenerMascotas(){
		BaseDatos db = new BaseDatos(contexto);
		insertarCincoMascotas(db);
		return db.obtenerTodasLasMascota();
	}
	
	public void insertarCincoMascotas(BaseDatos db){
		
		ContentValues contentValues = new ContentValues();
		
		contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Buldoc");
		contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.tres_perro);
		
		db.insertarMascota(contentValues);
		
		contentValues = new ContentValues();
		contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Luky");
		contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.uno_perro);
		
		db.insertarMascota (contentValues);
		
		contentValues = new ContentValues();
		contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Blaky");
		contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.ocho_perro);
		
		db.insertarMascota (contentValues);
		
		contentValues = new ContentValues();
		contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Laika");
		contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.seis_perro);
		
		db.insertarMascota (contentValues);
		
		contentValues = new ContentValues();
		contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Jafaso");
		contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.siete_perro);
		
		db.insertarMascota (contentValues);
	}
	
	public void darLikeMascota(Mascotas mascotas){
		
		BaseDatos db = new BaseDatos(contexto);
		
		ContentValues contentValues = new ContentValues();
		
		contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_ID_MASCOTA, mascotas.getId ());
		contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_NUMERO_LIKES, LIKE);
		
		db.insertarLikeContacto (contentValues);
	}
	
	public int obtenerLikesMascota(Mascotas mascotas){
		BaseDatos db = new BaseDatos(contexto);
		return db.obtenerLikesMascota(mascotas);
	}
}
