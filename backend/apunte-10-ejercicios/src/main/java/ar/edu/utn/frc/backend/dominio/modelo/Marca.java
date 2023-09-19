package ar.edu.utn.frc.backend.dominio.modelo;

import java.util.Objects;

public class Marca {
	private final Integer id;
	private final String nombre;

	public Marca(Integer aId, String aNombre) {
		id = aId;
		nombre = aNombre;
	}

	public Marca(String aNombre) {
		this(null, aNombre);
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@Override public String toString() {
		return "Marca{" +
			"nombre='" + nombre + '\'' +
			'}';
	}

	@Override public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Marca marca = (Marca) o;
		return Objects.equals(id, marca.id) && Objects.equals(nombre, marca.nombre);
	}

	@Override public int hashCode() {
		return Objects.hash(id, nombre);
	}
}
