class Surtidor:
    def __init__(self, nro_surtidor, cantidad, tipo):
        self.nro_surtidor = self.validar_nro_surtidor(nro_surtidor)
        self.cantidad = self.validar_cantidad(cantidad)
        self.tipo = self.validar_tipo(tipo)

    def validar_nro_surtidor(self, nro_surtidor):
        if 1 <= nro_surtidor <= 30:
            return nro_surtidor
        else:
            raise ValueError("Debería ser un número entre 1 y 30")

    def validar_cantidad(self, cantidad):
        if cantidad > 0:
            return cantidad
        else:
            raise ValueError("La cantidad debe ser un número positivo")

    def validar_tipo(self, tipo):
        if tipo in [1, 2, 3]:
            return tipo
        else:
            raise ValueError("El tipo es inválido. Debe ser 1, 2 o 3")

class EstacionDeServicio:
    def __init__(self):
        self.surtidores = []

    def agregar_surtidor(self, nro_surtidor, cantidad, tipo):
        surtidor = Surtidor(nro_surtidor, cantidad, tipo)
        self.surtidores.append(surtidor)

    def total_litros_vendidos_por_tipo(self):
        tipo_totales = {1: 0, 2: 0, 3: 0} # 1: Nafta Super, 2: Nafta Especial, 3: Gas Oil
        for surtidor in self.surtidores:
            tipo_totales[surtidor.tipo] += surtidor.cantidad
        return tipo_totales

    def surtidor_con_menos_ventas(self):
        min_cantidad = float('inf')
        nro_surtidor_menor_ventas = None
        for surtidor in self.surtidores:
            if surtidor.cantidad < min_cantidad:
                min_cantidad = surtidor.cantidad
                nro_surtidor_menor_ventas = surtidor.nro_surtidor
        return nro_surtidor_menor_ventas

    def promedio_litros_vendidos_por_surtidor(self):
        total_litros = sum(surtidor.cantidad for surtidor in self.surtidores)
        num_surtidores = len(self.surtidores)
        if num_surtidores > 0:
            return total_litros / num_surtidores
        return 0

# Prueba del código
estacion = EstacionDeServicio()

estacion.agregar_surtidor(1, 500, 1)
estacion.agregar_surtidor(2, 750, 2)
estacion.agregar_surtidor(3, 300, 3)
estacion.agregar_surtidor(4, 400, 1)

print("---"*40)
print("Surtidores:")
total_por_tipo = estacion.total_litros_vendidos_por_tipo()
print("Total de Litros Vendidos por Tipo de Combustible:")
for tipo, litros in total_por_tipo.items():
    tipo_str = ""
    if tipo == 1:
        tipo_str = "Nafta Super"
    elif tipo == 2:
        tipo_str = "Nafta Especial"
    elif tipo == 3:
        tipo_str = "Gas Oil"
    print(f" - {tipo_str}: {litros} litros")

surtidor_menor_ventas = estacion.surtidor_con_menos_ventas()
print("Surtidor con Menos Ventas:", surtidor_menor_ventas)

promedio_litros_por_surtidor = estacion.promedio_litros_vendidos_por_surtidor()
print("Promedio de Litros Vendidos por Surtidor:", promedio_litros_por_surtidor)
print("---"*40)
