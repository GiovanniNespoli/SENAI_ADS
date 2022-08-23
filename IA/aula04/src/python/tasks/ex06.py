again = 1

while again == 1:

    name = input("Dígite o seu nome: ");
    password = input("Dígite sua senha: ");

    if name == password: 
        again = 1;
        print("Erro, digite as informações novamente...");
    else:
        again = 0;


