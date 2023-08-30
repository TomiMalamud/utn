package ar.edu.utn.frc.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ar.edu.utn.frc.backend.modelo.DireccionEmail;
import ar.edu.utn.frc.backend.modelo.Dni;
import ar.edu.utn.frc.backend.modelo.NombreCompleto;
import ar.edu.utn.frc.backend.modelo.Persona;
import ar.edu.utn.frc.backend.modelo.Telefono;

public class PersonaTest {


	@Test
	public void validarEmailIncorrecto() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new DireccionEmail("pepe");
		});
		assertEquals("La dirección de email no es válida", exception.getMessage());
	}

	@Test
	public void validarEmailCorrecto() {
		final String emailEsperado = "prueba@gmail.com";
		final DireccionEmail email = new DireccionEmail(emailEsperado);

		assertEquals(emailEsperado, email.getDireccion());
	}

	@Test
	public void validarTelefonoIncorrecto() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Telefono("123");
		});
		assertEquals("El número de teléfono no es válido", exception.getMessage());
	}

	@Test
	public void validarTelefonoCorrecto() {
		final String telefonoEsperado = "+549 (351) 123-4567";

		final Telefono telefono = new Telefono(telefonoEsperado);

		assertEquals(telefonoEsperado, telefono.getNumero());
	}

	@Test
	public void validarDniIncorrecto() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Dni("123");
		});
		assertEquals("El número de DNI no es válido", exception.getMessage());
	}

	@Test
	public void validarEmailNoProporcionado() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Persona(
				new NombreCompleto("Juan", "Perez"),
				new Dni("12345678"),
				LocalDate.now().minusYears(20),
				null
			);
		});
		assertEquals("La dirección de email no puede ser nula", exception.getMessage());
	}

	@Test
	public void validarDniNoProporcionado() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Persona(
				new NombreCompleto("Juan", "Perez"),
				null,
				LocalDate.now().minusYears(20),
				new DireccionEmail("prueba@gmail.com"));
		});
		assertEquals("El DNI no puede ser nulo", exception.getMessage());
	}

	@Test
	public void validarNombreCompletoNoProporcionado() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Persona(
				null,
				new Dni("12345678"),
				LocalDate.now().minusYears(20),
				new DireccionEmail("prueba@gmail.com"));
		});
		assertEquals("El nombre completo no puede ser nulo", exception.getMessage());
	}

	@Test
	public void validarFechaNacimientoIncorrecta() {
		IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Persona(
				new NombreCompleto("Juan", "Perez"),
				new Dni("12345678"),
				LocalDate.now().plusYears(1),
				new DireccionEmail("prueba@gmail.com"));
		});
		assertEquals("La fecha de nacimiento no puede ser posterior a la fecha actual", exception.getMessage());
	}
}
