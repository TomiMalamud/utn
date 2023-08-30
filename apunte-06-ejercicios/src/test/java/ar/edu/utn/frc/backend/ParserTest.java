package ar.edu.utn.frc.backend;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ParserTest {

    @Test
    public void fechaCorrecta() {
        LocalDate expected = LocalDate.of(2023, 8, 30);
        LocalDate result = Parser.parseToLocalDate("30-08-2023");
        assertEquals(expected, result);
    }

    @Test
    public void fechaIncorrectaNoExcepcion() {
        assertDoesNotThrow(() -> {
            Parser.parseToLocalDate("");
        });
    }

    @Test
    public void fechaIncorrectaFechaActual() {
        LocalDate expected = LocalDate.now();
        LocalDate result = Parser.parseToLocalDate("");
        assertEquals(expected, result);
    }

    @Test
    public void stringAIntCorrectamente() {
        int expected = 19;
        int result = Parser.parseToInt("19", 1);
        assertEquals(expected, result);
    }

    @Test
    public void stringAIntIncorrectoNoExcepcion() {
        assertDoesNotThrow(() -> {
            Parser.parseToInt("asd", 1);
        });
    }

    @Test
    public void stringAIntIncorrectoDevuelveValorPorDefecto() {
        int expected = 10;
        int result = Parser.parseToInt("asdasd", 10);
        assertEquals(expected, result);
    }
}
