package ar.edu.utn.frc.backend.dominio.repositorio;

import ar.edu.utn.frc.backend.dominio.modelo.Modelo;

public interface ModeloRepository {
	Modelo get(Integer id);
}
