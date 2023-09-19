class Cuenta:
    def __init__(self, numero, cliente):
        self.numero = numero
        self.cliente = cliente
        self.saldo = 0

    def __str__(self):
        return f"{self.numero} - {self.cliente} - {self.saldo}"
    
    def depositar(self, monto):
        self.saldo += monto
    def extraer(self, monto):
        self.saldo -= monto
    
class Ahorro(Cuenta):
    def __init__(self, numero, cliente):
        super().__init__(numero, cliente)        
    
    def extraer(self, monto):
        if self.saldo - monto >= 0:
            self.saldo -= monto
        else:
            print("Saldo insuficiente")

class Corriente(Cuenta):
    def __init__(self, numero, cliente, descubierto):
        super().__init__(numero, cliente)
        self.descubierto = descubierto
    
    
    def extraer(self, monto):
        if self.saldo + self.descubierto - monto >= 0:
            self.saldo -= monto
        else:
            print("Saldo insuficiente")

print("======")
print("Cuenta")
print("======")
cuenta = Ahorro(1, "Juan")
cuenta2 = Corriente(2, "Pedrito", 1000)
cuenta.depositar(400)
cuenta.extraer(500)
print(cuenta)
cuenta2.depositar(100)
cuenta2.extraer(900)
print(cuenta2)
