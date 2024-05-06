# PEDRO CAVA - PROVA 1 - EXERCÍCIO 4

# Declaração e atribuição das variáveis

carga_max = int(input("Informe a carga da máxima que o elevador pode aguentar (em kg): "))
peso1 = float(input("Informe o peso da primeira pessoa: "))
peso2 = float(input("Informe o peso da segunda pessoa: "))
peso3 = float(input("Informe o peso da terceira pessoa: "))
peso4 = float(input("Informe o peso da quarta pessoa: "))
peso5 = float(input("Informe o peso da quinta pessoa: "))

# Cálculo do peso total das pessoas

peso_total = peso1 + peso2 + peso3 + peso4 + peso5

# Comparação do peso das pessoas com a carga do elevador

if(carga_max < peso_total):
    print("O elevador excedeu a capacidade máxima de carga.")           # Impressão do resultado
else:
    print("Elevador liberado.")                                         # Impressão do resultado 