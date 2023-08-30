package ar.edu.utn.frc.backend.modelo;

public final class Telefono {
	private static final String PATRON = "^(\\+\\d{1,3}\\s?)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$";

	private final String numero;

	public Telefono(String aNumero) {
		numero = null;
	}

	public String getNumero() {
		return numero;
	}
}
