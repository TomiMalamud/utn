# Lectura de códigos postales
# El archivo cp.csv contiene el listado de los códigos postales de tres provincias argentinas. En cada línea se encuentran, separados por un símbolo de punto y coma (;) los siguientes datos:

# Provincia, representada por una letra mayúscula según el estándar ISO correspondiente.
# Código, es un número entero de cuatro dígitos que identifica una localidad o varias localidades vecinas. Puede estar repetido.
# Nombre, es el nombre de la localidad correspondiente a ese código.

# Se requiere leer todo el contenido del archivo y guardarlo en una lista que contenga un elemento por cada línea. En cada elemento debe almacenarse alguna estructura de datos que permita acceder individualmente a cada dato que conforma un codigo postal.
#Luego de la carga el programa debe permitir el ingreso de uno o más códigos numéricos y listar provincia y nombre de todas las localidades asignadas a dichos códigos.

def leer_archivo_cp(ruta_archivo):
    datos_cp = {}
    with open(ruta_archivo, "r") as archivo:
        for linea in archivo:
            linea = linea.strip() # Elimina espacios en blanco al principio y al final
            provincia, codigo, nombre = linea.split(";") # Separa los datos de la línea
            codigo = int(codigo)
            if codigo not in datos_cp:
                datos_cp[codigo] = [] # Crea una lista vacía para almacenar las localidades
            datos_cp[codigo].append((provincia, nombre)) # Agrega la localidad a la lista
    return datos_cp

def ingresarCP():
    codigos = []
    while True:
        codigo = input("Ingrese un código postal: ")
        if codigo == "":
            break
        codigos.append(int(codigo))
    return codigos

def mostrar_localidades(codigos, datos_cp):
    for codigo in codigos:
        localidades = datos_cp.get(codigo, [])
        for provincia, nombre in localidades:
            print(f"Provincia: {provincia} - Localidad: {nombre}")

def main():
    datos_cp = leer_archivo_cp("dao/cp.csv")
    
    codigos = ingresarCP()
    mostrar_localidades(codigos, datos_cp)

if __name__ == '__main__':
    main()
