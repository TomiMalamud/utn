from carga import Carga


class Packing(Carga):
    def __init__(self, contenido, peso_por_caja, cantidad, peso_estructura) -> None:
        super().__init__(contenido)

        self._peso_por_caja = peso_por_caja
        self._cantidad = cantidad
        self._peso_estructura = peso_estructura
    
    @property
    def peso_por_caja(self):
        return self._peso_por_caja

    @property
    def cantidad(self):
        return self._cantidad

    @property
    def peso_estructura(self):
        return self._peso_estructura

    def peso(self):
        return self._peso_por_caja * self._cantidad + self._peso_estructura

    def __str__(self) -> str:
        return f"{super().__str__()} - Peso: {self.peso()} kg"