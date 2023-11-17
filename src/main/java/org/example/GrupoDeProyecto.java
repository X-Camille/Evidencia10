package org.example;

import java.util.*;

public class GrupoDeProyecto {
	private ArrayList<Empleado> empleados;

	public GrupoDeProyecto() {
		this.empleados = new ArrayList<Empleado>();
	}

	public GrupoDeProyecto(ArrayList<Empleado> empleados){
		this.empleados = empleados;
	}

	public ArrayList<Empleado> getEmpleados(){
		return empleados;
	}

	public void agregarEmpleado(Empleado empleado) {
		boolean empleadoExiste = false;
		for (Empleado emp : empleados) {
			if (emp.getNombre().equals(empleado.getNombre())) {
				empleadoExiste = true;
				break;
			}
		}
		if (!empleadoExiste) {
			empleados.add(empleado);
			System.out.println("Empleado agregado correctamente.");
		} else {
			System.out.println("El empleado ya existe. No se ha agregado.");
		}
	}


	public void eliminarEmpleado(Empleado empleado) {
		boolean empleadoExiste = false;
		for (Empleado emp : empleados) {
			if(emp.getNombre().equals(empleado.getNombre())) {
				empleados.remove(empleado);
				System.out.println("Empleado eliminado con éxito.");
				break;
			}
		}
		if (!empleadoExiste){
			System.out.println("El empleado no existe. No se ha podido eliminar.");
		}

	}

}