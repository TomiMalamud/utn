package ar.edu.utn.frc.backend.dominio.modelo;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Modelo {
	private final Integer id;
	private final String nombre;
	private final int anio;
	private final Marca marca;
	private final List<TipoAuto> tipos;

	public Modelo(Integer aId, String aNombre, int aAnio, Marca aMarca, List<TipoAuto> aTipos) {
		id = aId;
		nombre = aNombre;
		anio = aAnio;
		marca = aMarca;
		tipos = aTipos;
	}

	public Modelo(String aNombre, int aAnio, Marca aMarca, List<TipoAuto> aTipos) {
		this(null, aNombre, aAnio, aMarca, aTipos);
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAnio() {
		return anio;
	}

	public Marca getMarca() {
		return marca;
	}

	public List<TipoAuto> getTipos() {
		return Collections.unmodifiableList(tipos);
	}


	@Override
	public String toString() {
		return "Modelo{" + "nombre='" + nombre + '\'' +
			", anio=" + anio +
			", marca=" + marca +
			", tipos=" + tipos +
			'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Modelo modelo = (Modelo) o;
		return anio == modelo.anio && Objects.equals(id, modelo.id) && Objects.equals(nombre, modelo.nombre) && Objects.equals(marca, modelo.marca) && Objects.equals(tipos, modelo.tipos);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, anio, marca, tipos);
	}
}
