package ar.edu.utn.frc.backend.infraestructura;

public final class Conexion {
	public static final String DB_URL = "jdbc:h2:mem:test;INIT=RUNSCRIPT FROM 'classpath:db/migration/init.sql';";
}
