class Empresa:
    def __init__(self) -> None:
        self._plantel = {}
    
    def agregar(self, nuevo):
        self._plantel[nuevo.legajo] = nuevo

    def buscar(self, legajo):
        return self._plantel.get(legajo, None)
    
    def total_sueldos(self):
        return sum(map(lambda e: e.neto, self._plantel.values()))
    
    def cantidad_empleados(self):
        return len(self._plantel)
    
    def cantidad_tipo(self):
        c=[0,0,0]
        for e in self._plantel.values():
            c[e.tipo-1]+=1

        return c