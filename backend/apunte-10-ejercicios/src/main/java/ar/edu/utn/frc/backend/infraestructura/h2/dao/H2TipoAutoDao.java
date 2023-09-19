package ar.edu.utn.frc.backend.infraestructura.h2.dao;

import ar.edu.utn.frc.backend.infraestructura.dao.TipoAutoDao;
import ar.edu.utn.frc.backend.infraestructura.entidad.TipoAutoEntity;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static ar.edu.utn.frc.backend.infraestructura.Conexion.DB_URL;

public class H2TipoAutoDao implements TipoAutoDao {
    @Override
    public List<TipoAutoEntity> getTipoAutoPorModelo(int modeloId) {
        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("SELECT t.id, t.nombre FROM modelo_tipo_auto mt INNER JOIN tipo_auto t on mt.id_tipo_auto = t.id WHERE mt.id_modelo="+modeloId)) {
            List<TipoAutoEntity> resultado = new LinkedList<>();
            while (rs.next()){

                TipoAutoEntity entity = new TipoAutoEntity(
                        rs.getInt("ID"),
                        rs.getString("NOMBRE")
                );
                resultado.add(entity);
            }
            return resultado;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
