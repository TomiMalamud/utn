package ar.edu.utn.frc.backend.infraestructura.entidad;

public class MarcaEntity {
    private final Integer id;
    private final String nombre;

    public MarcaEntity(Integer id, String nombre) {
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
