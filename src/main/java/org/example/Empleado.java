package org.example;

import java.util.*;

public class Empleado extends Persona {
	private Departamento departamento;
	private ArrayList<Persona> colegas;
	private ArrayList<Casa> casas;

	public Empleado(Departamento departamento, ArrayList<Persona> colegas, ArrayList<Casa> casas, String nombre, String ocupacion, Moto vehiculo) {
		super(nombre, ocupacion, vehiculo);
		this.departamento = departamento;
		this.colegas = colegas;
		this.casas = casas;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public ArrayList<Persona> getColegas() {
		return this.colegas;
	}

	public void setColegas(ArrayList<Persona> colegas) {
		this.colegas = colegas;
	}

}