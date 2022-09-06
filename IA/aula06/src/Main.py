import calculadora;

print("Bem vindo!!");

while 1 == 1:
    num1 = int(input("Selecione o 1º número:"));
    num2 = int(input("Selecione o 2º número:"));

    soma = calculadora.soma(num1,num2);
    subtracao = calculadora.sub(num1,num2);
    multiplicacao = calculadora.mult(num1,num2);
    divisao = calculadora.div(num1,num2);

    print(f'Soma = {soma}');
    print(f'Subtração = {subtracao}');
    print(f'Multiplicação = {multiplicacao}');
    print(f'Divisão = {divisao}')