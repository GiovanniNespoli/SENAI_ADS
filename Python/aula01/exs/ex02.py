# Programa que mostre a area de um círculo

from cmath import pi


raio = float(input('Digíte o raio: '));

area = pi*(raio*raio);

print(f'O raio digitado foi {raio} a área é {area:.2f}');