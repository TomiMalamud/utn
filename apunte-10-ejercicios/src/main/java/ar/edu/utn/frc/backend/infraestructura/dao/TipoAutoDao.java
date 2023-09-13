package ar.edu.utn.frc.backend.infraestructura.dao;

import ar.edu.utn.frc.backend.infraestructura.entidad.TipoAutoEntity;

import java.util.List;

public interface TipoAutoDao {
    List<TipoAutoEntity> getTipoAutoPorModelo(int modeloId);
}
