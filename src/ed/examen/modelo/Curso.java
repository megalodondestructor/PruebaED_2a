package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oscar
 * version 1.1
 */
public class Curso {
	
	private List<Persona> listaAlumnos;

	
	/**
	 * @param dni, introdce el dni String de la persona a eliminar
	 * @throws Exception cuando el dni no tiene la longitud adecuada
	 * este metodo permite eliminar alumnos introduciendo el dni de la persona
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	
	/**
	 * @param p introduce la persona a agnadir
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	
	/**
	 * @param dni dni de la persona que queremos saber si esta registrada
	 * @return devuelve true si el alumno esta registrado, false si no es el caso
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	

	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	
	/**
	 * @return devuelve la lista de todos los alumnos 
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
