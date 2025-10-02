import random;

numeros= []
mostrar= ""

cantidad = int(input("Ingrese la cantidad de numeros a validar: "))

for i in range (0,cantidad):
    numero = random.randint(100,99999)
    numeros.append(numero)
    mostrar += (f"{numero},")
print (f"Numeros generados: {mostrar.rstrip(', ')}")



for i in numeros:
    
    strNumero=str(i)
    SumNumero= 0

    for digito in strNumero:
        SumNumero+=int(digito)

    Inverso = strNumero[::-1]
    if SumNumero % 2 == 0 and int(Inverso) % 3 == 0:
        print (f"{i}-> Si")
    else:
        print(f"{i}-> No")
        

