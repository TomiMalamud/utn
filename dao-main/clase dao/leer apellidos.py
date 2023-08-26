buscarApellido = input("Ingresar apellido: ")

def main():
    with open('personas.txt', 'r') as archivo:
        for linea in archivo:
            documento, nombre, apellido, edad = linea.strip().split(',')
            
            if apellido == buscarApellido:
                print(f"Nombre: {nombre}, Edad: {edad}")

if __name__ == '__main__':
    main()

