from empresa import Empresa
from obrero import Obrero
from admin import Admin
from vendedor import Vendedor


class Lector:
    @staticmethod
    def leer_empleados(nombreArchivo, empresa: Empresa):
        archivo = open(nombreArchivo, "r")
        
        for linea in archivo.readlines():
            if linea.startswith("1"):
                nuevo = Obrero.desde_linea(linea)
            elif linea.startswith("2"):
                nuevo = Admin.desde_linea(linea)
            elif linea.startswith("3"):
                nuevo = Vendedor.desde_linea(linea)

            empresa.agregar(nuevo)
        archivo.close()
