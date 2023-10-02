from carga import Carga

class Camion:
    def __init__(self, patente, carga_maxima) -> None:
        self._patente = patente
        self._estado = "Disponible"
        self._carga_maxima = carga_maxima
        self._cargas = []
    
    def __str__(self) -> str:
        return f"{self._patente} - {self._estado} - {self._carga_maxima} kg"

    def cantidad_cargas(self):
        return len(self._cargas)
    
    def subir_carga(self, carga: Carga):
        if self._estado == "Disponible":
            if self._carga_maxima >= carga.peso() + self.peso_cargas():
                self._cargas.append(carga)
            else:
                raise Exception("La carga excede la capacidad del camion")
        else:
            raise Exception("El camion no esta disponible")
    
    def bajar_carga(self, carga: Carga):
        if self._estado == "Disponible":
            if carga in self._cargas:
                self._cargas.remove(carga)
            else:
                raise Exception("La carga no esta en el camion")
        else:
            raise Exception("El camion no esta disponible")

    def peso_cargas(self):
        return sum(carga.peso() for carga in self._cargas)

    def a_reparacion(self):
        self._estado = "En reparación"
        
    def sale_reparado(self):
        self._estado = "Disponible"
        
    def en_viaje(self):
        self._estado = "En viaje"
        
    def de_regreso(self):
        self._estado = "Disponible"
    
    def listo_para_salir(self):
        if self._estado == "Disponible" and self.peso_cargas() >= 0.75 * self._carga_maxima:
            return True
        return False
    
    def cargas_en_orden(self):
        return "\n".join(str(carga) for carga in sorted(self._cargas, key=lambda x: x.peso()))