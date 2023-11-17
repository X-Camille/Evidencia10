package org.example;

import java.util.ArrayList;

public class Casa {

	private Condominio condominio;
	private Empleado empleado;
	private ArrayList<Persona> propietarios;
	private String direccion;

	public Casa(Condominio condominio, Empleado empleado, ArrayList<Persona> propietarios, String direccion) {
		this.condominio = condominio;
		this.empleado = empleado;
		this.propietarios = propietarios;
		this.direccion = direccion;
	}

}