package ar.edu.utn.frc.backend;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import ar.edu.utn.frc.backend.modelo.Auto;

public class VectorTest {

	@Test
	public void devuelveLaCantidadCorrecta() throws FileNotFoundException {

		Auto[] autos = cargarListaDeAuto();

		int resultado = Vector.obtenerCantidadPorMarcaYAnio(autos, "Audi", 2020);

		assertEquals(7, resultado);
	}

	@Test
	public void devuelveLaCantidadCorrecta2() throws FileNotFoundException {

		Auto[] autos = cargarListaDeAuto();

		int resultado = Vector.obtenerCantidadPorMarcaYAnio(autos, "BMW", 2021);

		assertEquals(17, resultado);
	}

	@Test
	public void devuelveLaCantidadDeConvertibles() throws FileNotFoundException {

		Auto[] autos = cargarListaDeAuto();

		int resultado = Vector.obtenerCantidadDeConvertibles(autos);

		assertEquals(14, resultado);
	}

	@Test
	public void devuelveLaCantidadDeAutosPorMarca() throws FileNotFoundException {

		Auto[] autos = cargarListaDeAuto();

		String[] resultado = Vector.obtenerLasMarcasQueVendanSedanes(autos);

		assertArrayEquals(new String[] { "Acura", "Alfa Romeo", "Audi", "Bentley", "BMW" }, resultado);
	}

	private Auto[] cargarListaDeAuto() throws FileNotFoundException {
		String path = URLDecoder.decode(ClassLoader.getSystemResource("autos.csv").getPath(), StandardCharsets.UTF_8);
		Auto[] autos;
		int numeroDeAutos = 0;
		File archivo = new File(path);
		try (Scanner scanner = new Scanner(archivo)) {
			while (scanner.hasNextLine()) {
				scanner.nextLine();
				numeroDeAutos++;
			}
		}

		try (Scanner scanner = new Scanner(archivo)) {
			autos = new Auto[numeroDeAutos];
			for (int i = 0; i < autos.length; i++) {
				if (scanner.hasNextLine()) {
					autos[i] = convertir(scanner.nextLine());
				}
			}
		}
		return autos;
	}

	private Auto convertir(String value) {
		String[] valores = value.split(",");
		return new Auto(Integer.parseInt(valores[0]),
			valores[1],
			valores[2],
			valores[3].split("\\|"));
	}
}
