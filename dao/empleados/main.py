from empresa import Empresa
from lector import Lector

empresa = Empresa()
Lector.leer_empleados("empleados.csv", empresa)
print(f"Cantidad de empleados leídos: {empresa.cantidad_empleados()}")
print(f"Total de sueldos: {empresa.total_sueldos():,.2f}")
contadores = empresa.cantidad_tipo()
print(f"Obreros: {contadores[0]}")
print(f"Admins: {contadores[1]}")
print(f"Vendedores: {contadores[2]}")
buscado = int(input("Ingrese legajo a buscar: "))
e = empresa.buscar(buscado)
if e:
    print(e)
else:
    print("No se encontró el empleado")
