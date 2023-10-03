from typing import Any, Type
import random
from camion import Camion
from caja import Caja
from packing import Packing
from bidon import Bidon


def cargar_desde_csv(archivo: str, carga: Type[Any], camion: Camion) -> None:
    """Carga los objetos de un archivo CSV en un camión.

    Args:
        archivo (str): Archivo en csv a leer
        carga (Type[Any]): Tipo de carga a crear, entre Caja, Packing y Bidon.
        camion (Camion): Camión al que se le cargarán las cargas.
    """
    with open(archivo, "rt") as file:
        file.readline()  # Descarta la primera línea
        for line in file:
            if random.choice([True, False]):
                fields = line.strip().split(",")
                first_field = fields[0]
                remaining_fields = [float(x) for x in fields[1:]]  # Convertir a float

                item = carga(first_field, *remaining_fields)  # Crear objeto
                try:
                    camion.subir_carga(item)
                except ValueError as e:
                    available_weight = camion.carga_maxima - camion.peso_cargas
                    print(
                        f"No se pudo cargar {item}. Supera el peso máximo. Disponible: {available_weight:.2f}"
                    )


def main() -> None:
    camion = Camion("KMS851", 180)

    # Test subir_carga y bajar_carga
    caja_test = Caja("Electrónicos", 30)
    camion.subir_carga(caja_test)
    camion.bajar_carga(caja_test)

    # Test cambio de estado
    camion.a_reparacion()
    print(camion._estado)
    camion.sale_reparado()
    print(camion._estado)
    camion.en_viaje()
    print(camion._estado)
    camion.de_regreso()
    print(camion._estado)

    # Test listo_para_salir
    for archivo, carga in [
        ("Cajas.csv", Caja),
        ("Packing.csv", Packing),
        ("Bidones.csv", Bidon),
    ]:
        cargar_desde_csv(archivo, carga, camion)

    listo = (
        "El camión está listo para salir."
        if camion.listo_para_salir()
        else "El camión no está listo para salir."
    )
    print(f"{camion}\n{listo}")


if __name__ == "__main__":
    main()
