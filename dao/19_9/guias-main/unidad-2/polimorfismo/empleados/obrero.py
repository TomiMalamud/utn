
from empleado import Empleado


class Obrero(Empleado):
    def __init__(self, legajo, nombre, apellido, basico, dias):
        super().__init__(legajo, nombre, apellido, basico)
        self._dias = dias

    @property
    def dias(self):
        return self._dias
    
    @property
    def neto(self):
        return self.basico / 22 * self._dias

    @property
    def tipo(self):
        return 1
    
    def __str__(self) -> str:
        return super().__str__() + " " + str(self.dias)
    
    @staticmethod
    def desde_linea(linea):
        valores = linea.split(";")
        legajo = int(valores[1])
        nombre = valores[2]
        apellido = valores[3]
        basico = float(valores[4])
        dias = int(valores[5])
        return Obrero(legajo, nombre, apellido, basico, dias)    
    