from empleado import Empleado

class Admin(Empleado):
    def __init__(self, legajo, nombre, apellido, basico, presentismo):
        super().__init__(legajo, nombre, apellido, basico)
        self._presentismo = presentismo
    
    @property
    def presentismo(self):
        return self._presentismo
    
    @property
    def neto(self):
        return self.basico * (1.13 if self.presentismo else 1)
    
    @property
    def tipo(self):
        return 2
    
    def __str__(self) -> str:
        return f"{super().__str__()} - {self.presentismo}"
    
    @staticmethod
    def desde_linea(linea):
        valores = linea.split(";")
        legajo = int(valores[1])
        nombre = valores[2]
        apellido = valores[3]
        basico = float(valores[4])
        presentismo = valores[5] == "True"
        return Admin(legajo, nombre, apellido, basico, presentismo)
