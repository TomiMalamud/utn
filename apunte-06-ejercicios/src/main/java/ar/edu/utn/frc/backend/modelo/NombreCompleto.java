package ar.edu.utn.frc.backend.modelo;

public class NombreCompleto {
	private final String nombre;
	private final String apellido;

	public NombreCompleto(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}
}
