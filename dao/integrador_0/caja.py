from carga import Carga


class Caja(Carga):
    def __init__(self, contenido, peso) -> None:
        super().__init__(contenido)
        self._peso = peso

    def peso(self):
        return self._peso
    
    def __str__(self) -> str:
        return f"{super().__str__()} - {self._peso} kg"