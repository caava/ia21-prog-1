# PEDRO CAVA - PROVA 1 - EXERCÍCIO 1

# Declaração e atribuição das variáveis

alt_degrau = float(input("Informe a altura do degrau (em metros): "))
alt = float(input("Informe a altura que deseja alcançar (em metros): "))

# Cálculo da altura exata requerida

qtd_degrau = alt/alt_degrau

# Cálculo da quantidade de degraus

if(alt%alt_degrau == 0):
    qtd_degrau = int(qtd_degrau)                 # Se ja for exata, apenas tranformar em int
else:
    qtd_degrau = int(qtd_degrau) + 1             # Se não for exata, adicionar um degrau

# Impressão do resultado desejado

print(f"Para alcançar a altura desejada deve-se subir {qtd_degrau} degrais.")