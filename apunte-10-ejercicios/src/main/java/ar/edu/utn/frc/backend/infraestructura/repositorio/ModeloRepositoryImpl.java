package ar.edu.utn.frc.backend.infraestructura.repositorio;

import ar.edu.utn.frc.backend.dominio.modelo.Marca;
import ar.edu.utn.frc.backend.dominio.modelo.Modelo;
import ar.edu.utn.frc.backend.dominio.modelo.TipoAuto;
import ar.edu.utn.frc.backend.dominio.repositorio.ModeloRepository;
import ar.edu.utn.frc.backend.infraestructura.dao.MarcaDao;
import ar.edu.utn.frc.backend.infraestructura.dao.ModeloDao;
import ar.edu.utn.frc.backend.infraestructura.dao.TipoAutoDao;
import ar.edu.utn.frc.backend.infraestructura.entidad.MarcaEntity;
import ar.edu.utn.frc.backend.infraestructura.entidad.ModeloEntity;
import ar.edu.utn.frc.backend.infraestructura.entidad.TipoAutoEntity;

import java.util.List;

public class ModeloRepositoryImpl implements ModeloRepository {
    private final MarcaDao marcaDao;
    private final ModeloDao modeloDao;
    private final TipoAutoDao tipoAutoDao;

    public ModeloRepositoryImpl(MarcaDao marcaDao, ModeloDao modeloDao, TipoAutoDao tipoAutoDao) {
        this.marcaDao = marcaDao;
        this.modeloDao = modeloDao;
        this.tipoAutoDao = tipoAutoDao;
    }

    @Override
    public Modelo get(Integer id) {
        final ModeloEntity modeloEntity = modeloDao.getModelo(id);
        final MarcaEntity marcaEntity = marcaDao.getMarca(modeloEntity.getId_marca());
        final List<TipoAutoEntity> entityList = tipoAutoDao.getTipoAutoPorModelo(id);

        final List<TipoAuto> tipoAutos = entityList
                .stream()
                .map((entity) -> new TipoAuto(
                        entity.getId(),
                        entity.getNombre())
                )
                .toList();
        return new Modelo(
                modeloEntity.getId(),
                modeloEntity.getNombre(),
                modeloEntity.getAnio(),
                new Marca(
                        marcaEntity.getId(),
                        marcaEntity.getNombre()
                ),
                tipoAutos
        );
    }
}
