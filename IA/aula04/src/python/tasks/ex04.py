aumento = float;
novoSalario = float;
percentual = str;


salario = float(input("Digite o seu salário: "))

if salario <= 280.00:
    aumento = salario * 0.2;
    novoSalario = aumento + salario;
    percentual = str("20%")

elif salario > 280.00 and salario <= 700.00:
    aumento = salario * 0.15;
    novoSalario = aumento + salario;
    percentual = str("15%")

elif salario > 700.00 and salario <= 1500.00:
    aumento = salario * 0.10;
    novoSalario = aumento + salario;
    percentual = str("10%")
else:
    aumento = salario * 0.05;
    novoSalario = aumento + salario;
    percentual = str("5%")

print(f'Salário antes do reajuste: {salario}')
print(f'Percentual de aumento aplicado: {percentual}')
print(f'Valor do aumento: {aumento}')
print(f'Novo salário: {novoSalario}')


