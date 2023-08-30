package ar.edu.utn.frc.backend.modelo;

public class Auto {
	private final int anio;
	private final String marca;
	private final String modelo;
	private final String[] tipos;

	public Auto(int anio, String marca, String modelo, String[] tipos) {
		this.anio = anio;
		this.marca = marca;
		this.modelo = modelo;
		this.tipos = tipos;
	}

	public int getAnio() {
		return anio;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String[] getTipos() {
		return tipos;
	}
}
