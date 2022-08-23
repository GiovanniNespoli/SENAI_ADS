again = 1

while again == 1:

    nome = input("Digite seu nome: ");
    idade = int(input("Digite a sua idade: "));
    sal = float(input("Digite o seu salário: "));
    EsC = input("Digite o seu estado civil ([s,c,v,d])");

    if len(nome) > 3 or idade >= 0 and idade <= 100 or sal > 0 or EsC == 's' or EsC == 'c' or EsC == 'v' or EsC == 'd':
        again = 0
    else:
        print('Dados errados....')
        again = 1;