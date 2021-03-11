package ed.examen.modelo;

/**
 * @author oscar
 * version 1.1
 */
public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	
	/**
	 * @param dni introduce el string dni de la persona
	 * @param nombre introduce el nombre de la persona String
	 * @param apellido1 introduce el apellido de la persona
	 * este constructor permite introducir una persona al programa
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	
	/**
	 * @return Este metodo devuelve el dni de una persona
	 */
	public String getDni() {
		return dni;
	}
	
	
	
	/**
	 * @param dni, introduce el dni de la persona como parametro
	 * @throws Exception salta una excepcion si el ultimo caracter del dni no es una letra.
	 * este metodo permite establecer el dni de una persona
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	
	/**
	 * @return este mertodo devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	
	/**
	 * @param nombre introduce el nombre a cambiar
	 * este metodo permite cambiar el nombre de una persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/**
	 * @return este metodo devuelve el apellido de la persona
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	
	/**
	 * @param apellido1 introduce el nuevo apellido de la persona
	 * este metodo permite cambiar el apellido de una persona
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
