from operator import itemgetter
cidade = 1
while True:
    N = int(input())
    if N == 0:
        break
    pessoas = 0
    consumo_total = 0
    valores = {}
    for i in range(N):
        X, Y = map(int, input().split())
        pessoas += X
        consumo_total += Y
        consumo = Y//X
        if consumo in valores: 
            valores[consumo] += X
        else:
            valores[consumo] = X
    #print(valores)
    consumo_medio = consumo_total/pessoas
    dados_ordenados = dict(sorted(valores.items()))
    #print(dados_ordenados)
    print(f"Cidade# {cidade}:")
    for chave, valor in dados_ordenados.items():
        print(f"{valor} - {chave}", end=" ")
    print()
    print(f"Consumo medio: {consumo_medio:.2f} m3.")
    print()
    cidade += 1
