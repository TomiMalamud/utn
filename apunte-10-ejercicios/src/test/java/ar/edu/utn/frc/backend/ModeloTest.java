package ar.edu.utn.frc.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import ar.edu.utn.frc.backend.infraestructura.h2.dao.H2MarcaDao;
import ar.edu.utn.frc.backend.infraestructura.h2.dao.H2ModeloDao;
import ar.edu.utn.frc.backend.infraestructura.h2.dao.H2TipoAutoDao;
import ar.edu.utn.frc.backend.infraestructura.repositorio.ModeloRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.utn.frc.backend.dominio.modelo.Marca;
import ar.edu.utn.frc.backend.dominio.modelo.Modelo;
import ar.edu.utn.frc.backend.dominio.modelo.TipoAuto;
import ar.edu.utn.frc.backend.dominio.repositorio.ModeloRepository;

public class ModeloTest {
	ModeloRepository modeloRepository = new ModeloRepositoryImpl(
			new H2MarcaDao(),
			new H2ModeloDao(),
			new H2TipoAutoDao()
	);

	@BeforeEach
	public void before() throws ClassNotFoundException {
		Class.forName("org.h2.Driver");
	}

	@Test
	public void obtieneElModeloCorrecto() {
		final Modelo modeloEsperado = new Modelo(
			50,
			"2 Series",
			2021,
			new Marca(8, "BMW"),
			List.of(
				new TipoAuto(1, "Sedan"),
				new TipoAuto(3, "Convertible"),
				new TipoAuto(6, "Coupe")
			)
		);
		final Modelo modelo = modeloRepository.get(50);

		assertEquals(modeloEsperado, modelo);
	}
}
