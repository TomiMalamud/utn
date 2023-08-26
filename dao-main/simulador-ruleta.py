import random

class Ruleta:
    def __init__(self):
        self.rojos = [1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36] # Resto de números
        self.negros = [2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35] # La suma de sus dígitos es par, salvo el 10.
        self.verde = [0]

    def tirar(self):
        return random.randint(0, 36)

    def simular(self):
        resultados = []
        conteo_pares = 0
        conteo_impares = 0
        conteo_docena1 = 0
        conteo_docena2 = 0
        conteo_docena3 = 0
        conteo_ceros = 0
        conteo_rojos = 0
        conteo_negros = 0
        cantidad_tiradas=100
        for _ in range(cantidad_tiradas):
            resultado = self.tirar()
            resultados.append(resultado)
            if resultado in self.verde: # Condicional anidado. Primero evalúa color (0 es verde)
                conteo_ceros += 1
            elif resultado in self.rojos:
                conteo_rojos += 1
                if resultado % 2 == 0: # Luego evalúa paridad
                    conteo_pares += 1
                else:
                    conteo_impares += 1
                if resultado <= 12:     # De forma paralela, evalúa docena.
                    conteo_docena1 += 1
                elif resultado <= 24:
                    conteo_docena2 += 1
                else:
                    conteo_docena3 += 1
            else:
                conteo_negros += 1
                if resultado % 2 == 0:
                    conteo_pares += 1
                else:
                    conteo_impares += 1
                if resultado <= 12:
                    conteo_docena1 += 1
                elif resultado <= 24:
                    conteo_docena2 += 1
                else:
                    conteo_docena3 += 1
        print("---"*40)
        print(f"Conteo de pares: {conteo_pares}")
        print(f"Conteo de impares: {conteo_impares}")
        print(f"Conteo de la 1ra docena: {conteo_docena1}")
        print(f"Conteo de la 2da docena: {conteo_docena2}")
        print(f"Conteo de la 3ra docena: {conteo_docena3}")
        print(f"Porcentaje de ceros: {round(conteo_ceros / cantidad_tiradas * 100, 2) }%")
        print(f"Conteo de rojos: {conteo_rojos}")
        print(f"Conteo de negros: {conteo_negros}")
        print(f"Test: {resultados}") if cantidad_tiradas <=100 else None
        print("---"*40)

juego = Ruleta()
juego.simular()
