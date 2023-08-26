package ar.edu.utn.frc.backend;

public class Condicional {


	/**
	 * Devuelve el número mayor de los dos recibidos por parámetro, si son iguales devuelve -1
	 *
	 * @param numero          El primer número
	 * @param numeroAComparar El segundo número
	 * @return El número mayor de los dos recibidos por parámetro, si son iguales devuelve -1
	 */
	public static int obtenerMayorNumero(int numero, int numeroAComparar) {
		if (numero == numeroAComparar) {
			return -1;
		}
		else {
        	return Math.max(numero, numeroAComparar);
		}
	}



	/**
	 * Devolver el color correspondiente al número recibido por parámetro
	 * 1: Rojo
	 * 2: Verde
	 * 3: Azul
	 * De lo contrario devolver "No es un color válido"
	 *
	 * @param numero El número del cual se quiere obtener el color
	 * @return El color correspondiente al número recibido por parámetro
	 */
	public static String obtenerColor(int numero) {
        return switch (numero) {
            case (1) -> "Rojo";
            case (2) -> "Verde";
			case (3) -> "Azul";
            default -> "No es un color válido";
        };


    }
}
