package ar.edu.utn.frc.backend.modelo;

import java.time.LocalDate;

public class Persona {
	private NombreCompleto nombreCompleto;
	private Dni dni;
	private LocalDate fechaNacimiento;
	private Telefono telefono;
	private DireccionEmail direccionEmail;

	public Persona(NombreCompleto aNombreCompleto, Dni aDni, LocalDate aFechaNacimiento, DireccionEmail aDireccionEmail) {
		setDni(aDni);
		setFechaNacimiento(aFechaNacimiento);
		setNombreCompleto(aNombreCompleto);
		setDireccionEmail(aDireccionEmail);
	}

	public NombreCompleto getNombreCompleto() {
		return nombreCompleto;
	}

	public Dni getDni() {
		return dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public DireccionEmail getDireccionEmail() {
		return direccionEmail;
	}

	private void setDni(Dni aDni) {
		dni = aDni;
	}

	private void setDireccionEmail(DireccionEmail aDireccionEmail) {
		direccionEmail = aDireccionEmail;
	}

	public void setTelefono(Telefono aTelefono) {
		telefono = aTelefono;
	}

	private void setNombreCompleto(NombreCompleto aNombreCompleto) {
		nombreCompleto = aNombreCompleto;
	}

	private void setFechaNacimiento(LocalDate aFechaNacimiento) {
		fechaNacimiento = aFechaNacimiento;
	}
}
