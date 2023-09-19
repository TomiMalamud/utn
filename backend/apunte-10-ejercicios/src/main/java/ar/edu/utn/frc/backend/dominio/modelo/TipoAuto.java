package ar.edu.utn.frc.backend.dominio.modelo;

import java.util.Objects;

public class TipoAuto {
	private final Integer id;
	private final String nombre;

	public TipoAuto(Integer aId, String aNombre) {
		id = aId;
		nombre = aNombre;
	}

	public TipoAuto(String aNombre) {
		this(null, aNombre);
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	@Override public String toString() {
		return "TipoAuto{" +
			"nombre='" + nombre + '\'' +
			'}';
	}

	@Override public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TipoAuto tipoAuto = (TipoAuto) o;
		return Objects.equals(id, tipoAuto.id) && Objects.equals(nombre, tipoAuto.nombre);
	}

	@Override public int hashCode() {
		return Objects.hash(id, nombre);
	}
}
