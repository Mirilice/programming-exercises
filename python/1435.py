while True:
    tamanho = int(input())
    if tamanho == 0:
        break
    
    for i in range(tamanho):
        linha = []
        for j in range(tamanho):
            menor = i
            if j < menor:
                menor = j
            if tamanho - 1 - i < menor:
                menor = tamanho - 1 - i
            if tamanho - 1 - j < menor:
                menor = tamanho - 1 - j
            linha.append(menor + 1)
        print(" ".join(f"{num:3}" for num in linha))
    print()
