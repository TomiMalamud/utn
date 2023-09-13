package ar.edu.utn.frc.backend.infraestructura.entidad;

public class ModeloEntity {
    private final Integer id;
    private final String nombre;
    private final Integer anio;
    private final Integer id_marca;

    public ModeloEntity(Integer id, String nombre, Integer anio, Integer id_marca) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.id_marca = id_marca;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public Integer getId_marca() {
        return id_marca;
    }
}
