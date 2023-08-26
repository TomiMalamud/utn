package ar.edu.utn.frc.backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura {

	/**
	 * Crear un método que reciba la dirección de un archivo de texto y devuelva el total de los números que contiene
	 *
	 * @param direccionArchivo Dirección del archivo de texto
	 * @return El total de los números que contiene
	 * @throws FileNotFoundException
	 */
	public static int calcularTotal(String direccionArchivo) throws FileNotFoundException {
		int suma = 0;
		File file = new File(direccionArchivo);
		Scanner miScanner = new Scanner(file);
		while (miScanner.hasNext()){
			int numero = miScanner.nextInt();
			suma +=numero;
		}
		miScanner.close();
		return suma;
	}

	/**
	 * Crear un método que reciba la dirección de un archivo de texto y devuelva el promedio de los números que contiene
	 *
	 * @param direccionArchivo Dirección del archivo de texto
	 * @return El promedio de los números que contiene
	 * @throws FileNotFoundException
	 */
	public static float calcularPromedio(String direccionArchivo) throws FileNotFoundException {
		int suma = 0;
		int count = 0;
		File file = new File(direccionArchivo);
		Scanner miScanner = new Scanner(file);
		while (miScanner.hasNext()){
			int numero = miScanner.nextInt();
			suma +=numero;
			count ++;
		}
		miScanner.close();
		return (float) suma /count;
	}
}
