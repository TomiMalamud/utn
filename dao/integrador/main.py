from camion import Camion
from packing import Packing
from caja import Caja
from bidon import Bidon

def main():
    # Crear un camión con una carga máxima de 1000 kg
    mi_camion = Camion("ABC-123", 100)
    print(f"Información del camión: {mi_camion}")

    # Crear algunas cargas y packings
    todas_las_cargas = [
        Packing("Material de construcción", 20, 1, 10),
        Packing("Material de construcción", 10, 1, 10),
        Caja("Material de herrería", 20),
        Bidon("Bidon de agua", 20, 1)
    ]

    # Subir las cargas al camión y mostrar información
    for carga in todas_las_cargas:
        mi_camion.subir_carga(carga)
        print(f"Subida la carga: {carga}")

    print(f"Cantidad de cargas en el camión: {mi_camion.cantidad_cargas()}")
    print(f"Peso total de las cargas en el camión: {mi_camion.peso_cargas()} kg")

    # Cambiar el estado del camión y comprobar si está listo para salir
    mi_camion.a_reparacion()
    print(f"Estado del camión: {mi_camion._estado}")
    mi_camion.sale_reparado()
    print(f"Estado del camión: {mi_camion._estado}")

    # Verificar si el camión está listo para salir
    if mi_camion.listo_para_salir():
        print("El camión está listo para salir.")
    else:
        print("El camión no está listo para salir.")    

    print("---"*20)
    # Listar las cargas en orden de peso
    print(f"Cargas en orden de peso: \n\n{mi_camion.cargas_en_orden()}")

if __name__ == "__main__":
    main()
