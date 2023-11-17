package org.example;

import java.util.ArrayList;

public class Departamento {

	private ArrayList<Empleado> empleados;
	private String nombre;
	private ArrayList<GrupoDeProyecto> gruposDeProyecto;

	public Departamento(String nombre, ArrayList<Empleado> empleados, ArrayList<GrupoDeProyecto> grupoDeProyecto) {
		this.nombre = nombre;
		this.empleados = empleados;
		this.gruposDeProyecto = grupoDeProyecto;
	}

	public Departamento(String nombre, ArrayList<GrupoDeProyecto> grupoDeProyecto) {
		this.nombre = nombre;
		this.empleados = new ArrayList<Empleado>();
		this.gruposDeProyecto = grupoDeProyecto;
	}

	public Departamento(String nombre) {
		this.nombre = nombre;
		this.empleados = new ArrayList<Empleado>();
		this.gruposDeProyecto = new ArrayList<GrupoDeProyecto>();
	}

	public String getNombre(){
		return nombre;
	}

	public void agregarGrupoDeProyecto(GrupoDeProyecto grupoProyecto){
		boolean grupoExiste = false;
		for (GrupoDeProyecto grupo : gruposDeProyecto){
			if (grupo.getEmpleados().equals(grupoProyecto.getEmpleados())){
				grupoExiste = true;
				break;
			}
		}
		if (!grupoExiste) {
			gruposDeProyecto.add(grupoProyecto);
			System.out.println("Grupo de proyecto agregado con éxito");
		} else {
			System.out.println("El grupo de proyecto ya existe.");
		}
	}

	public void eliminarGrupoDeProyecto(GrupoDeProyecto grupoProyecto){
		boolean grupoExiste = false;
		for (GrupoDeProyecto grupo : gruposDeProyecto){
			if (grupo.getEmpleados().equals(grupoProyecto.getEmpleados())){
				grupoExiste = true;
				break;
			}
		}
		if (grupoExiste) {
			gruposDeProyecto.remove(grupoProyecto);
			System.out.println("Grupo de proyecto eliminado con éxito.");
		} else {
			System.out.println("El grupo de proyecto no existe. No se ha podido eliminar.");
		}
	}
}