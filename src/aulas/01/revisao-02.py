pessoas = {"Nome":[], "Idade":[]}
maior_nome = ''
menor_nome = ''
maior_idade = 0
menor_idade = 200

for x in range(1,11):
    print("\n")
    pessoas["Nome"].append(input(f'Informe o nome da pessoa nº {x}: '))
    pessoas["Idade"].append(input(f'Informe o idade da pessoa nº {x}: '))

print("\n")
for nome, idade in zip(pessoas["Nome"], pessoas["Idade"]):
    if int(idade) > int(maior_idade):
        maior_idade = idade
        maior_nome = nome
    elif int(idade) <= int(menor_idade):
        menor_idade = idade
        menor_nome = nome

    print(f'Nome: {nome} - Idade: {idade}')

print(f'\nA maior idade é de {maior_nome} com {maior_idade} anos')
print(f'A menor idade é de {menor_nome} com {menor_idade} anos')