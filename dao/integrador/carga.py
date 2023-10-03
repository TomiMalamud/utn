class Carga:
    def __init__(self, contenido) -> None:
        self._contenido = contenido

    @property
    def contenido(self):
        return self._contenido

    def __str__(self) -> str:
        return f"Contenido: {self._contenido}"

    def peso(self):
        pass
