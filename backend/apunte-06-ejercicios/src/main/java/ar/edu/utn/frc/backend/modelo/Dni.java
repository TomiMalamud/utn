package ar.edu.utn.frc.backend.modelo;

public final class Dni {

	//String#matches
	private final static String PATRON = "^[0-9]{8}$";

	String numero;

	public Dni(String aNumero) {
		numero = aNumero;
	}

	public String getNumero() {
		return numero;
	}
}
