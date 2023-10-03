from carga import Carga
from enum import Enum


class EstadoCamion(Enum):
    DISPONIBLE = "Disponible"
    EN_REPARACION = "En reparación"
    EN_VIAJE = "En viaje"


class Camion:
    def __init__(self, patente: str, carga_maxima: float) -> None:
        self._patente = patente
        self._estado = EstadoCamion.DISPONIBLE
        self._carga_maxima = carga_maxima
        self._cargas = []

    @property
    def carga_maxima(self) -> float:
        return self._carga_maxima

    def __str__(self) -> str:
        return f"""{'='*40}
        PATENTE: {self._patente}, ESTADO: {self._estado.value}
        CARGA MÁXIMA: {self.carga_maxima}
        {'-'*40}
        CANTIDAD DE CARGAS: {self.cantidad_cargas()}, PESO DE CARGAS: {self.peso_cargas}
        {'-'*40}
        CARGAS:
        {self.cargas_en_orden()}
        {'='*40}"""

    def cantidad_cargas(self) -> int:
        return len(self._cargas)

    def subir_carga(self, carga: Carga) -> None:
        if self._estado == EstadoCamion.DISPONIBLE:
            if self.peso_cargas() + carga.peso() <= self._carga_maxima:
                self._cargas.append(carga)
            else:
                raise ValueError("El peso supera la carga máxima")
        else:
            raise ValueError("El camión no está disponible")

    def bajar_carga(self, carga: Carga) -> None:
        if self._estado == EstadoCamion.DISPONIBLE:
            if carga in self._cargas:
                self._cargas.remove(carga)
            else:
                raise ValueError("La carga no está en el camión")
        else:
            raise ValueError("El camión no está disponible")

    def peso_cargas(self) -> float:
        return sum(carga.peso() for carga in self._cargas)

    def a_reparacion(self) -> None:
        self._estado = EstadoCamion.EN_REPARACION

    def sale_reparado(self) -> None:
        self._estado = EstadoCamion.DISPONIBLE

    def en_viaje(self) -> None:
        self._estado = EstadoCamion.EN_VIAJE

    def de_regreso(self) -> None:
        self._estado = EstadoCamion.DISPONIBLE

    def listo_para_salir(self) -> bool:
        return (
            self._estado == EstadoCamion.DISPONIBLE
            and self.peso_cargas() >= 0.75 * self._carga_maxima
        )

    def cargas_en_orden(self) -> str:
        return "\n".join(
            str(carga) for carga in sorted(self._cargas, key=lambda x: x.peso())
        )
