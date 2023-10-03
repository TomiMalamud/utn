from packing import Packing
from caja import Caja
from bidon import Bidon
from camion import Camion

def cargar_datos(archivo, carga, camion : Camion):
    with open(archivo, "rt") as a:
        a.readline()
        for line in a:
            fields = line.strip().split(",")
            first_field = fields[0]
            remaining_fields = [float(x) for x in fields[1:]]
            item = carga(first_field, *remaining_fields)
            try:
                camion.subir_carga(item)
            except ValueError as e:
                available_weight = camion.carga_maxima - camion.peso_cargas()
                print(f"No se pudo cargar {item}. Supera el peso máximo. Disponible: {available_weight:.2f}")

def main():
    camion = Camion("MKZ735", 200)

    for archivo, carga in [('Packing.csv', Packing),
                           ('Cajas.csv', Caja),
                           ('Bidones.csv', Bidon)]:
        cargar_datos(archivo, carga, camion)

    print(camion)
    

if __name__ == "__main__":
    main()