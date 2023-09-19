from obrero import Obrero
from administrativo import Administrativo
from vendedor import Vendedor
from empresa import Empresa


class Lector:
    
    @staticmethod
    def leer_empleados(nombre_archivo, empresa: Empresa):
        
        archivo = open(nombre_archivo)
        for linea in archivo.readlines():
            if linea.startswith("1"): nuevo= Obrero.desde_linea(linea)
            elif linea.startswith("2"): nuevo = Administrativo.desde_linea(linea)
            elif linea.startswith("3"): nuevo = Vendedor.desde_linea(linea)

            empresa.agregar_empleado(nuevo)
        
        archivo.close()
