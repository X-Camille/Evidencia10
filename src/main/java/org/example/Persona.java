package org.example;

public class Persona {
	protected String nombre;
	protected String ocupacion;
	protected Moto vehiculo;

	public Persona(String nombre, String ocupacion, Moto vehiculo) {
		this.nombre = nombre;
		this.ocupacion = ocupacion;
		this.vehiculo = vehiculo;
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}
}