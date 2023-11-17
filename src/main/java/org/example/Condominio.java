package org.example;

import java.util.*;

public class Condominio {
	private String nombre;
	private ArrayList<Casa> casas;

	public Condominio(String nombre, ArrayList<Casa> casas) {
		this.nombre = nombre;
		this.casas = casas;
	}
}