package ar.edu.utn.frc.backend.infraestructura.h2.dao;

import ar.edu.utn.frc.backend.infraestructura.dao.MarcaDao;
import ar.edu.utn.frc.backend.infraestructura.entidad.MarcaEntity;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

import static ar.edu.utn.frc.backend.infraestructura.Conexion.DB_URL;

public class H2MarcaDao implements MarcaDao {
    @Override
    public MarcaEntity getMarca(int id) {
        try(Connection connection = DriverManager.getConnection(DB_URL);
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT id, nombre FROM marca WHERE id="+id)) {
            if(rs.next()){
                return new MarcaEntity(rs.getInt("ID"),
                        rs.getString("NOMBRE")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
