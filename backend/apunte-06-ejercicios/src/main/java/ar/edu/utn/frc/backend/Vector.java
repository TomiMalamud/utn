package ar.edu.utn.frc.backend;

import ar.edu.utn.frc.backend.modelo.Auto;

public class Vector {

	/*
	 * Devuelve la cantidad de autos de una marca y un año determinado
	 *
	 * @param autos array de autos
	 * @param marca marca a buscar
	 * @param anio año a buscar
	 * @return cantidad de autos de una marca y un año determinado
	 */
	public static int obtenerCantidadPorMarcaYAnio(Auto[] autos, String marca, int anio) {
		int count = 0;

		for (Auto auto : autos) {
			if (auto.getMarca().equals(marca) && auto.getAnio() == anio) {
				count++;
			}
		}
		return count;
	}


	/*
	 * Devuelve la cantidad de autos convertibles
	 *
	 * @param autos array de autos
	 * @return cantidad de autos convertibles
	 */
	public static int obtenerCantidadDeConvertibles(Auto[] autos) {
		int count1 = 0;

		for (Auto auto : autos) {
			for (String tipo : auto.getTipos())
			   if ("Convertible".equals(tipo)){
				   count1++;
				   break;
			   }
        }
		return count1;
	}

	/*
	 * Devuelve un array con las marcas que vendan sedanes
	 *
	 * @param autos array de autos
	 * @return array de marcas
	 */
	public static String[] obtenerLasMarcasQueVendanSedanes(Auto[] autos) {
		String[] marcasConSedanes = new String[0];

		for (Auto auto : autos) {
			for (String tipo : auto.getTipos()) {
				if ("Sedan".equals(tipo)) {
					boolean esDuplicado = false;
					for (String marcaActual : marcasConSedanes) {
						if (auto.getMarca().equals(marcaActual)) {
							esDuplicado = true;
							break;
						}
					}

					if (!esDuplicado) {
						String[] MarcasConSedanes1 = new String[marcasConSedanes.length + 1];

                        System.arraycopy(marcasConSedanes, 0, MarcasConSedanes1, 0, marcasConSedanes.length);

						MarcasConSedanes1[marcasConSedanes.length] = auto.getMarca();

						marcasConSedanes = MarcasConSedanes1;
					}

					break;
				}
			}
		}

		return marcasConSedanes;
	}
}
