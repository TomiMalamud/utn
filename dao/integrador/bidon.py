from carga import Carga

class Bidon(Carga):
    def __init__(self, contenido, capacidad, densidad) -> None:
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
        return self.capacidad * self.densidad
    
    def __str__(self) -> str:
        return f"{self.contenido} - {self.capacidad} litros - {self.densidad} kg/m3"