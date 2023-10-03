from carga import Carga


class Bidon(Carga):
    def __init__(self, contenido: str, capacidad : float, densidad : float ) -> None:
        super().__init__(contenido)
        self._capacidad = capacidad
        self._densidad = densidad
    
    @property
    def capacidad(self):
        return self._capacidad
    
    @property
    def densidad(self):
        return self._densidad

    def peso(self):
        return self._capacidad * self._densidad

    def __str__(self) -> str:
        return f"{super().__str__()} - {self.peso()} kg"