# -*- coding: utf-8 -*-

numeros = []
for i in range(100):
    num = float(input())
    numeros.append(num)
    
for i in range(100):
    if numeros[i] <= 10:
        print(f"A[{i}] = {numeros[i]:.1f}")