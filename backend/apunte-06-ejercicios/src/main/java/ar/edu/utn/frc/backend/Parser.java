package ar.edu.utn.frc.backend;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * La clase Parser proporciona métodos para analizar y convertir datos
 * de un tipo a otro.
 */
public class Parser {

    /**
     * Formato predefinido para analizar fechas en formato "dd-MM-yyyy".
     */
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    /**
     * Convierte una cadena de texto en un objeto LocalDate utilizando el formato especificado.
     * Si la cadena no puede ser analizada, se imprime un mensaje de error y se devuelve la fecha actual.
     *
     * @param date La cadena de texto que representa la fecha.
     * @return El objeto LocalDate obtenido después de analizar la cadena, o la fecha actual si hay un error.
     */
    public static LocalDate parseToLocalDate(String date) {
        // Here, I assume it's in the format "yyyy-MM-dd". Change this if needed.
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            return LocalDate.parse(date, dateFormatter);
        } catch (DateTimeParseException e) {
            System.out.println("Error. Se muestra fecha actual.");
            return LocalDate.now();
        }
    }


    /**
     * Convierte una cadena numérica en un entero.
     * Si la cadena no puede ser convertida a entero, se imprime un mensaje de error y se devuelve el valor predeterminado.
     *
     * @param number       La cadena numérica que se va a convertir.
     * @param defaultValue El valor predeterminado a devolver si hay un error en la conversión.
     * @return El valor entero obtenido después de convertir la cadena, o el valor predeterminado si hay un error.
     */
    public static int parseToInt(String number, int defaultValue) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Error. Se muestra un valor predeterminado.");
            return defaultValue;
        }
    }
}
