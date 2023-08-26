package ar.edu.utn.frc.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

public class LecturaTest {

	@Test
	public void elTotalEsCorrecto() throws FileNotFoundException {
		int resultado = Lectura.calcularTotal(ClassLoader.getSystemResource("numeros.txt").getPath());
		assertEquals(resultado, 1030);
	}

	@Test
	public void elPromedioEsCorrecto() throws FileNotFoundException {
		float resultado = Lectura.calcularPromedio(ClassLoader.getSystemResource("numeros.txt").getPath());
		assertEquals(resultado, 128.75f);
	}
}
