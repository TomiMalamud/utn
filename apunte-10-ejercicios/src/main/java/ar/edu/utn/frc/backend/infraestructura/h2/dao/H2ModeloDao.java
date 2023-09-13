package ar.edu.utn.frc.backend.infraestructura.h2.dao;

import ar.edu.utn.frc.backend.infraestructura.dao.ModeloDao;
import ar.edu.utn.frc.backend.infraestructura.entidad.ModeloEntity;

import java.sql.*;

import static ar.edu.utn.frc.backend.infraestructura.Conexion.DB_URL;

public class H2ModeloDao implements ModeloDao {
    @Override
    public ModeloEntity getModelo(int id) {
        try (Connection connection = DriverManager.getConnection(DB_URL);
             Statement stm = connection.createStatement();
             ResultSet rs = stm.executeQuery("SELECT * FROM modelo WHERE id="+id)) {
            if(rs.next()){
                return new ModeloEntity(rs.getInt("ID"),
                        rs.getString("NOMBRE"),
                        rs.getInt("ANIO"),
                        rs.getInt("ID_MARCA")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
