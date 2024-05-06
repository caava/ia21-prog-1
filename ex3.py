# PEDRO CAVA - PROVA 1 - EXERCÍCIO 3

# Declaração e atribuição das variáveis

nmr1 = int(input("Informe o valor do primeiro número: "))
nmr2 = int(input("Informe o valor do segundo número: "))
nmr3 = int(input("Informe o valor do terceiro número: "))

# Verificação da igualdade dos números

if(nmr1 == nmr2 or nmr1 == nmr3 or nmr2 == nmr3):
    igual = True                                                               # declaração de variável auxiliar
    while(igual):                                                              # Laço de verificação
        if (nmr1 == nmr2 or nmr1 == nmr3):
            nmr1 = int(input("Por favor insira um novo valor para o número pois há igual a outro informado: "))    # Troca do número
        if(nmr2 == nmr3):
            nmr2 = int(input("Por favor insira um novo valor para o número pois há é igual a outro informado: "))  # Troca do número
        if(nmr1 != nmr2 and nmr1 != nmr3 and nmr2 != nmr3):                    # Verificação de novo
            igual = False                                                      # Fim do laço

# Comparação lógica de valor 

if(nmr1 != nmr2 and nmr1 != nmr3 and nmr2 != nmr3):
    if(nmr1 < nmr2):                                             # Se o 1 é menor que 2     
        if(nmr1 < nmr3):                                         # Se o 1 é menor que o 3
            if(nmr2 < nmr3):                                     # Se o 2 é menor que o 3
                print(f"O valor intermediário é {nmr2}.")        # Então o 2 é o intermediário
            else:
                print(f"O valor intermediário é {nmr3}")         # Então o 3 é intermediário
        else:
            print(f"O valor intermediário é {nmr1}.")            # Então o 1 é intermediário
    elif(nmr1 < nmr3):                                           # Se o 1, maior que o 2, é menor que o 3
        print(f"O valor intermediário é {nmr1}.")                # então o 1 é intermediário
    elif(nmr1 > nmr3):                                           # Se o 1, maior que o 2, é maior que o 3
        if(nmr2 < nmr3):                                         # Se o 2, menor que o 1, é menor que o 3
            print(f"O valor intermediário é {nmr3}.")            # Então o 3 é intermediário
        else:
            print(f"O valor intermediário é {nmr2}.")            # Então o 2 é o intermediário