# Enunciado:
# Una entidad bancaria necesita administrar información relacionada con los préstamos que realiza a su cartera de 
# clientes. 
# Se pide generar las siguientes Salidas:
# a. Hay más préstamos Personales o Para adquisición de viviendas?
# b. Hay préstamos a más de 15 años? 
# c. " El Plazo promedio de pagos para préstamos Personales es MENOR al plazo promedio de pago de los préstamos 
# para Mejora de viviendas. " Esta aseveración es cierta o falsa? 
# d. Código de préstamo que tiene menor monto de préstamo.
# e. Validar el Tipo de Préstamo . 
# Para ello Ud. dispone de las siguientes Entradas: cada Préstamo posee los siguientes datos: 
# • Código de Transacción (Cod): código que identifica unívocamente el préstamo.
# • Tipo Préstamo (TipoP): donde 1=Adquisición de Vivienda; 2=Mejora de Vivienda; 3=Personal, que representa 
# el tipo de préstamo a solicitar.
# • Monto Préstamo (MontoP): expresado en PESOS, que representa el monto de préstamo a solicitar.
# • Plazo de pago (Plazo): expresado en años, representa la cantidad de años en que se devuelve el préstamo. 
# Diseñe una solución algorítmica que brinde una solución adecuada que automatice esta problemática, para 
# administrar 1500 préstamos.

bandera_mayor15=False
contador_adquisicion=0
contador_personal=0
plazo1=0
plazo3=0
menorMonto= float("inf")
for prestamo in range(5):
    cod=int(input("Ingrese el codigo del prestamo: ", ))
    TipoP=int(input("Ingrese el tipo del prestamo (1=Adquisición de Vivienda; 2=Mejora de Vivienda; 3=Personal): ", ))
    while TipoP<1 or TipoP>3:
        print("El tipo de prestamo es invalido")
        TipoP=int(input("Ingrese el tipo del prestamo (1=Adquisición de Vivienda; 2=Mejora de Vivienda; 3=Personal): ", ))

    MontoP=int(input("Ingrese el monto del prestamo: ", ))
    Plazo=int(input("Ingrese el plazo del prestamo: ", ))
    if TipoP==1:
        contador_adquisicion+=1
        plazo1+=Plazo
    elif TipoP==2:
        pass
    elif TipoP==3:
        contador_personal+=1
        plazo3+=Plazo
    if Plazo>15:
        bandera_mayor15=True
    if MontoP<menorMonto:
        menorMonto=MontoP

promedio1=plazo1/contador_adquisicion
promedio3=plazo3/contador_personal

if contador_adquisicion>contador_personal:
    print("Hay mas prestamos de adquisicion de vivienda")
else:
    print("Hay mas prestamos personales")
print("Hay prestamos a mas de 15 años: ", bandera_mayor15)
if promedio1<promedio3:
    print("El Plazo promedio de pagos para préstamos Personales es MENOR al plazo promedio de pago de los préstamos para Mejora de viviendas")
else:
    print("El Plazo promedio de pagos para préstamos Personales es MAYOR al plazo promedio de pago de los préstamos para Mejora de viviendas")
print("El codigo de prestamo con menor monto es: ", menorMonto)
print("Fin del programa")