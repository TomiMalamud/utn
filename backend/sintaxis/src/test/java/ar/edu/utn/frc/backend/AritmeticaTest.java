package ar.edu.utn.frc.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AritmeticaTest {

	@Test
	public void suma() {
		int suma = Aritmetica.suma(10, 5);
		assertEquals(15, suma);
	}

	@Test
	public void resta() {
		int resta = Aritmetica.resta(22, 7);
		assertEquals(15, resta);
	}

	@Test
	public void resto() {
		int resto = Aritmetica.resto(5, 2);
		assertEquals(1,resto);
	}

	@Test
	public void multiplicacion() {
		float resultado = Aritmetica.multiplicacion(13.6f, 21f);
		assertEquals(285.6f, resultado, 0.001);
	}

	@Test
	public void divisionTest() {
		float resultado = Aritmetica.division(15, 2);
		assertEquals(7.5f, resultado, 0.001);
	}

	@Test
	public void divisionControl0Test() {
		float resultado = Aritmetica.division(1293, 0);
		assertEquals(-1f, resultado);
	}

}
