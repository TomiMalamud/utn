package ar.edu.utn.frc.backend.infraestructura.entidad;

public class TipoAutoEntity {

    private final Integer id;
    private final String nombre;

    public TipoAutoEntity(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
