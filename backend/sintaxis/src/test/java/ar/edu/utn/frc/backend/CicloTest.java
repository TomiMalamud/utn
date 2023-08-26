package ar.edu.utn.frc.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CicloTest {

	@Test
	public void elTotalEsCorrecto() {
		int resultado = Ciclo.calcularTotal(new int[] {7, 67, 28, 99, 1002});
		assertEquals(resultado, 1203);
	}

	@Test
	public void elFactorialEsCorrecto() {
		int resultado = Ciclo.obtenerFactorial(5);
		assertEquals(resultado, 120);
	}

	@Test
	public void laCantidadDeNumerosParesEsCorrecta() {
		int resultado = Ciclo.calcularCantidadDeNumerosPares(new int[] {7, 67, 28, 88, 1002});
		assertEquals(resultado, 3);
	}
}
