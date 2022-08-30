idade = []
maxValue = None;
minValue = None;

for i in range(1,21,1):
    idade.insert(i,i)

for num in idade:
    if (maxValue is None or num > maxValue):
        maxValue = num

    if (minValue is None or num < minValue):
        minValue = num

print('Valor máximo:', maxValue)
print('Valor mínimo:', minValue)

