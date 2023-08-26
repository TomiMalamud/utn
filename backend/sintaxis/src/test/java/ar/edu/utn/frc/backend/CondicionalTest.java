package ar.edu.utn.frc.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CondicionalTest {


	@Test
	public void elMayorEsCorrecto() {
		int resultado = Condicional.obtenerMayorNumero(7, 67);
		assertEquals(resultado, 67);
	}

	@Test
	public void sonIguales(){
		int resultado = Condicional.obtenerMayorNumero(7, 7);
		assertEquals(resultado, -1);
	}

	@Test
	public void elColorRojoEsCorrecto() {
		String resultado = Condicional.obtenerColor(1);
		assertEquals(resultado, "Rojo");
	}

	@Test
	public void elColorVerdeEsCorrecto() {
		String resultado = Condicional.obtenerColor(2);
		assertEquals(resultado, "Verde");
	}

	@Test
	public void elColorAzulEsCorrecto() {
		String resultado = Condicional.obtenerColor(3);
		assertEquals(resultado, "Azul");
	}

	@Test
	public void elColorEsIncorrecto() {
		String resultado = Condicional.obtenerColor(4);
		assertEquals(resultado, "No es un color válido");
	}
}
