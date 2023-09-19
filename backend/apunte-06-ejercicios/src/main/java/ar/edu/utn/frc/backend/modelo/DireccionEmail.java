package ar.edu.utn.frc.backend.modelo;

public final class DireccionEmail {

	//String#matches
	private final static String PATRON = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

	private final String direccion;

	public DireccionEmail(String aDireccion) {
		direccion = null;
	}

	public String getDireccion() {
		return direccion;
	}
}
