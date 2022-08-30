import statistics


notas = [10, 20, 30, 40]

for i in range(len(notas)):
    print(f'Nota inserida: {notas[i]}')

media = statistics.mean(notas);

print(f'Média das notas: {media}');


