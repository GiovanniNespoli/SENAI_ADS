notas = []

for i in range(1,5,1):
    notas.append(int(input("Digite a "+str(i)+"º nota: ")));

media = sum(notas) /  len(notas); #sum -> soma dos valores dentro do array // len -L lenght

if media < 7:
    print("Reprovado");
elif media < 10 and media >= 7:
    print("Aprovado");
else:
    print("Super Aprovado");