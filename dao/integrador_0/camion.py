from enum import Enum
from carga import Carga


class EstadoCamion(Enum):
    DISPONIBLE = "Disponible"
    EN_REPARACION = "En reparación"
    EN_VIAJE = "En viaje"

class Camion:
    def __init__(self, patente, carga_maxima):
        self._patente = patente
        self._estado = EstadoCamion.DISPONIBLE
        self._carga_maxima = carga_maxima
        self._cargas = []

    @property
    def patente(self):
        return self._patente
    
    @property
    def carga_maxima(self):
        return self._carga_maxima
    
    def cantidad_cargas(self):
        return len(self._cargas)
    
    def peso_cargas(self):
        return sum(carga.peso() for carga in self._cargas)

    def subir_carga(self, carga: Carga):
        if self._estado == EstadoCamion.DISPONIBLE:
            if self.peso_cargas() + carga.peso() <= self._carga_maxima:
                self._cargas.append(carga)
            else:
                raise ValueError("El peso supera la carga máxima")

    def bajar_carga(self, carga: Carga):
        if self._estado == EstadoCamion.DISPONIBLE:
            if carga in self._cargas:
                self._cargas.remove(carga)
            else:
                raise ValueError("La carga no está en el camión")
    
    def a_reparacion(self):
        self._estado = EstadoCamion.EN_REPARACION
    
    def sale_reparado(self):
        self._estado = EstadoCamion.EN_REPARACION
    
    def en_viaje(self):
        if self.listo_para_salir():
            self._estado = EstadoCamion.EN_VIAJE
        else:
            raise ValueError("El camión no está listo para salir")
    
    def de_regreso(self):
        self._estado = EstadoCamion.DISPONIBLE
    
    def listo_para_salir(self):
        return (self._estado == EstadoCamion.DISPONIBLE and self.peso_cargas() / self._carga_maxima >= 0.75)

    def cargas_en_orden(self):
        return '\n'.join(str(carga) for carga in sorted(self._cargas, key= lambda carga:carga.peso()))
    
    def __str__(self) -> str:
        return f"""{'='*40}
PATENTE: {self._patente}, ESTADO: {self._estado.value}
CARGA MÁXIMA: {self._carga_maxima}
{'-'*40}
CANTIDAD DE CARGAS: {self.cantidad_cargas()}, PESO DE CARGAS: {self.peso_cargas()}
{'-'*40}
CARGAS:
{self.cargas_en_orden()}
{'='*40}
"""