package com.example.curso3semana5mascotas.db;

public class Mascotas {
	private int id;
	private String nombre;
	private int foto;
	private int likes = 0;
	
	
	
	public Mascotas (){}
	
	public Mascotas ( String nombre, int foto ) {
		this.nombre = nombre;
		this.foto = foto;
	}
	
	public int getId () {
		return id;
	}
	
	public void setId ( int id ) {
		this.id = id;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre ( String nombre ) {
		this.nombre = nombre;
	}
	
	public int getLikes () {
		return likes;
	}
	
	public void setLikes ( int likes ) {
		this.likes = likes;
	}
	
	public int getFoto () {
		return foto;
	}
	
	public void setFoto ( int foto ) {
		this.foto = foto;
	}
}
