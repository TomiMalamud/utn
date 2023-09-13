package ar.edu.utn.frc.backend.infraestructura.dao;


import ar.edu.utn.frc.backend.infraestructura.entidad.ModeloEntity;

public interface ModeloDao {
    ModeloEntity getModelo(int id);
}
