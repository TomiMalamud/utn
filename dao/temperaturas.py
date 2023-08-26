class Temperaturas:
    def __init__(self):
        self.temperaturas = []
    def cargar_temperaturas(self):
        temperatura = int(input("Ingrese la temperatura: "))
        while temperatura != 50:
            if -20 <= temperatura <= 49:
                self.temperaturas.append(temperatura)
            else:
                print("Temperatura fuera de rango. Se puede ingresar entre -20 y 49")
            temperatura = int(input("Ingrese la temperatura: "))
    def cantidad_dias_bajo_cero(self):
        cantidad = 0
        for temperatura in self.temperaturas:
            if temperatura < 0:
                cantidad += 1
        return cantidad
    def promedio_temperaturas(self):
        return sum(self.temperaturas) / len(self.temperaturas)
    def promedio_calidos(self):
        cantidad = 0
        suma = 0
        for temperatura in self.temperaturas:
            if temperatura > 20:
                cantidad += 1
                suma += temperatura
        if cantidad > 0:
            return suma / cantidad
        return 0
    def hubo_mas_de_40(self):
        for temperatura in self.temperaturas:
            if temperatura > 40:
                return True
        return False
    def mayor_temperatura_no_calida(self):
        mayor=float("-inf")
        for temperatura in self.temperaturas:
            if temperatura > mayor and temperatura <= 20:
                mayor = temperatura
        return mayor
    def cantidad_dias_menor_al_promedio(self):
        cantidad = 0
        promedio = self.promedio_temperaturas()
        for temperatura in self.temperaturas:
            if temperatura < promedio:
                cantidad += 1
        return cantidad
temperaturas = Temperaturas()
temperaturas.cargar_temperaturas()
print("Cantidad de días con temperatura bajo cero:", temperaturas.cantidad_dias_bajo_cero())
print("Promedio de temperaturas:", temperaturas.promedio_temperaturas())
print("Promedio de temperaturas de los días cálidos:", temperaturas.promedio_calidos())
if temperaturas.hubo_mas_de_40():
    print("Hubo días con más de 40 grados: Si")
else:
    print("Hubo días con más de 40 grados: No")
print("La mayor temperatura de los días que no fueron cálidos:", temperaturas.mayor_temperatura_no_calida())
print("Cantidad de días con temperatura menor al promedio:", temperaturas.cantidad_dias_menor_al_promedio())