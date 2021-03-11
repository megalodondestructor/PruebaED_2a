package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
	private Persona oscar = new Persona("11111111L", "oscar", "garcia");

	@Test
	void testPersona() {
		assertEquals("11111111L", oscar.getDni());
	}

	@Test
	void testPersonaStringStringString() {
		assertEquals("Oscar", oscar.getNombre());
	}

	@Test
	void testGetDni() {
		assertEquals("11111111L", oscar.getDni());
	}

	@Test
	void testSetDni() {
		try {
			oscar.setDni("00000000A");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("00000000A", oscar.getDni());
	}

	@Test
	void testGetNombre() {
		assertEquals("Oscar", oscar.getNombre());
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
