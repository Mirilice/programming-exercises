cases = 1
def busca_binaria(lista, alvo):
    inicio = 0
    fim = len(lista) - 1
    resultado = -1
    
    while inicio <= fim:
        meio = (inicio + fim) // 2
        
        if lista[meio] == alvo:
            resultado = meio
            fim = meio - 1
        elif lista[meio] < alvo:
            inicio = meio + 1
        else:
            fim = meio - 1
            
    return resultado

while True:
    N, Q = map(int, input().split())
    if N == 0 and Q == 0:
        break
    marmore = []
    for _ in range(N):
        marmore.append(int(input()))
    marmore.sort()
    print(f"CASE# {cases}:")
    for _ in range(Q):
        query = int(input())
        resultado = busca_binaria(marmore, query)
        if resultado != -1:
            print(f"{query} found at {resultado+1}")
        else:
            print(f"{query} not found")
    cases += 1

