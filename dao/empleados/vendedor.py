from empleado import Empleado

class Vendedor(Empleado):
    def __init__(self, legajo, nombre, apellido, basico, ventas):
        super().__init__(legajo, nombre, apellido, basico)
        self._ventas = ventas
    
    @property
    def ventas(self):
        return self._ventas
    
    @property
    def tipo(self):
        return 3
    
    @property
    def neto(self):
        return self.basico + self.ventas * 0.01
    
    def __str__(self) -> str:
        return f"{super().__str__()} - {self.ventas}"
    
    @staticmethod
    def desde_linea(linea):
        valores = linea.split(";")
        legajo = int(valores[1])
        nombre = valores[2]
        apellido = valores[3]
        basico = float(valores[4])
        ventas = float(valores[5])
        return Vendedor(legajo, nombre, apellido, basico, ventas)