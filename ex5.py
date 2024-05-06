# PEDRO CAVA - PROVA 1 - EXERCÍCIO 5

# Declaração e atribuição da variavel

salario = float(input("Informe o salário do funcionário: "))

# Verificação da quantidade de aumento

if(salario <= 1100):                        # Comparação com o valor determinante         
    aumento = salario * 0.15                # Cálculo do aumento
else:
    aumento = salario * 0.1                 # Cálculo do aumento

# Impressão do resultado

print(f"Parabéns. Você receberá um salário de R${aumento}.")