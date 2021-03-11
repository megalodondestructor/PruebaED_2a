package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {
	private Curso micurso = new Curso();
	@Test
	public void eliminarAlumnoTest() throws Exception {

		Persona oscar = new Persona("11111111L", "Oscar", "Garcia");
		micurso.aniadirAlumno(oscar);

		Integer Numerodealumnosantes = micurso.numeroAlumnos();

		micurso.eliminarAlumno(oscar.getDni());

		assertEquals(Numerodealumnosantes.intValue() - 1, micurso.numeroAlumnos().intValue());
		assertFalse(micurso.estaRegistrado(oscar.getDni()));

	}

	@Test
	public void aniadirAlumnoTest() {
		Integer Numerodealumnosantes = micurso.numeroAlumnos();

		Persona oscar = new Persona("11111111L", "Oscar", "Garcia");
		micurso.aniadirAlumno(oscar);

		assertEquals(Numerodealumnosantes.intValue() + 1, micurso.numeroAlumnos().intValue());
		assertTrue(micurso.estaRegistrado(oscar.getDni()));

	}

	@Test
	public void estaRegistradoTest() {
		Persona oscar = new Persona("11111111L", "Oscar", "Garcia");
		Persona ramon = new Persona("11111551L", "ramon", "galarza");

		micurso.aniadirAlumno(oscar);

		assertTrue(micurso.estaRegistrado(oscar.getDni()));
		assertFalse(micurso.estaRegistrado(ramon.getDni()));

	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
