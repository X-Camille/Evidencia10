package org.example;

import java.util.*;

public class Empresa {
	private String nombre;
	private ArrayList<Departamento> departamentos;

	public Empresa(String nombre, ArrayList<Departamento> departamentos) {
		this.nombre = nombre;
		this.departamentos = departamentos;
	}

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.departamentos = new ArrayList<Departamento>();
	}

	public void agregarDepartamento(Departamento departamento) {
		boolean departamentoExiste = false;
		for (Departamento dep : departamentos){
            if (dep.getNombre().equals(departamento.getNombre())) {
                departamentoExiste = true;
                break;
            }
		}
		if (!departamentoExiste){
			departamentos.add(departamento);
			System.out.println("Departamento agregado con éxito.");
		} else {
			System.out.println("El departamento ya existe.");
		}
	}

	public void eliminarDepartamento(Departamento departamento) {
		boolean departamentoExiste = false;
		for (Departamento dep : departamentos){
            if (dep.getNombre().equals(departamento.getNombre())) {
                departamentoExiste = true;
                break;
            }
		}
		if (departamentoExiste){
			departamentos.remove(departamento);
			System.out.println("Departamento eliminado con éxito.");
		} else {
			System.out.println("El departamento no existe. No se ha podido eliminar.");
		}
	}

}