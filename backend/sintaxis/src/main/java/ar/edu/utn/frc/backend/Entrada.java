package ar.edu.utn.frc.backend;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		int suma = 0;
		Scanner miScanner = new Scanner(System.in);
		System.out.println("Ingrese una serie de números (ingrese un número negativo para detenerse):");

		int numero;
		while ((numero=miScanner.nextInt())>0) {
			suma += numero;
		}

		System.out.println("La suma de los números positivos: " + suma);

	}
}
