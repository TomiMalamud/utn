# Desarrollar un programa que lea el archivo personas.csv y permita realizar una busqueda por apellido. El archivo posee separados por comas el documento, nombre, apellido y edad de un padrón de personas. El programa debe leer el archivo y sin almacenarlo en ninguna estructura de datos listar nombre y edad de todas las personas cuyo apellido coincida con el ingresado por el usuario

import csv

def buscar_apellido(archivo, apellido):
    with open(archivo) as ar:
        rows = csv.reader(ar)
        for row in rows:
            if row[2] == apellido:
                print(f'{row[1]} {row[3]}')

def main():
    archivo = 'personas.csv'
    apellido = input('Ingrese el apellido a buscar: ')
    buscar_apellido(archivo, apellido)

if __name__ == '__main__':
    main()