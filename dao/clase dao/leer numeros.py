# A continuación, desde la lista calcular e imprimir:

# Promedio de todos los números
# Cantidad de números mayores al promedio
# Generar y mostrar una nueva lista que contenga todos los números pares

def main():
    numeros=[]
    with open('numeros.txt','r') as archivo:
        for i in archivo:
            print(i)
            numero = float(i)
            numeros.append(numero)
            
    promedio = sum(numeros) / len(numeros)
    mayorProm = sum(1 for numero in numeros if numero > promedio)
    pares = [numero for numero in numeros if numero % 2 == 0]
    print(f"Promedio de todos los números: {promedio}")
    print(f"Cantidad de números mayores al promedio: {mayorProm}")
    print(f"Nueva lista que contiene todos los números pares: {pares}")

if __name__ == '__main__':
    main()