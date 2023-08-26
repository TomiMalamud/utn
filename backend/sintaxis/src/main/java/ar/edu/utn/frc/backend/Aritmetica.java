package ar.edu.utn.frc.backend;

/**
 * La clase Aritmetica proporciona métodos estáticos para realizar operaciones aritméticas simples.
 */
public class Aritmetica {
    /**
     * Calcula la suma de dos números enteros.
     *
     * @param x El primer número entero.
     * @param y El segundo número entero.
     * @return La suma de los dos números enteros.
     */

    public static int suma(int x, int y) {

        return x+y;
    }

    /**
     * Calcula la resta de dos números enteros.
     *
     * @param x El número del que se resta.
     * @param y El número que se resta.
     * @return La diferencia entre los dos números enteros.
     */
    public static int resta(int x, int y) {
        return x-y;
    }

    /**
     * Calcula el resto de la división entre dos números enteros.
     *
     * @param dividendo El número que se divide.
     * @param divisor El divisor.
     * @return El resto de la división entre el dividendo y el divisor.
     */
    public static int resto(int dividendo, int divisor) {
        return dividendo%divisor;
    }

    /**
     * Calcula el producto de dos números de punto flotante.
     *
     * @param factor1 El primer factor.
     * @param factor2 El segundo factor.
     * @return El producto de los dos factores.
     */
    public static float multiplicacion(float factor1, float factor2) {
        return factor1*factor2;
    }

    /**
     * Realiza la división de dos números de punto flotante. En una segunda version debe controlar
     * que el divisor no sea 0, si fuese 0 debe devolver -1
     *
     * @param dividendo El número que se divide.
     * @param divisor El divisor.
     * @return El resultado de la división entre el dividendo y el divisor.
     */
    public static float division(int dividendo, int divisor) {
        if (divisor != 0) {
            return (float) dividendo / divisor;
        } else {
            return (float) -1.0;
        }
    }
}
