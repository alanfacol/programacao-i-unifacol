def get_idade_index_by_dict(clientes_dict):
    menores18_index = []
    idade18_44_index = []
    maiores44_index = []

    for i, (nome, idade, sexo, endereco) in enumerate(zip(clientes_dict["nome"], clientes_dict["idade"], clientes_dict["sexo"], clientes_dict["endereco"])):
        if idade < 18:
            menores18_index.append(i)
        elif idade >= 18 and idade < 44:
            idade18_44_index.append(i)
        elif idade >= 44:
            maiores44_index.append(i)

    return menores18_index, idade18_44_index, maiores44_index

def get_cliente_data_by_index(index_list:list, clientes_dict):
    new_clientes = {"nome":[], "idade":[], "sexo":[], "endereco":[]}

    for index in index_list:
        new_clientes["nome"].append(clientes_dict["nome"][index])
        new_clientes["idade"].append(clientes_dict["idade"][index])
        new_clientes["sexo"].append(clientes_dict["sexo"][index])
        new_clientes["endereco"].append(clientes_dict["endereco"][index])

    return new_clientes

def show_clientes_data(clientes_dict):
    for nome, idade, sexo, endereco in zip(clientes_dict["nome"], clientes_dict["idade"], clientes_dict["sexo"], clientes_dict["endereco"]):
        print("--------------------------------")
        print(f'Nome: {nome}')
        print(f'Idade: {idade}')
        print(f'Sexo: {sexo}')
        print(f'Endereco: {endereco}')

clientes = {
    "nome":[
        "Alan", "Ana", "Isabela", "Pedro", "Ricardo", "Marta", "Jhonatas", "Filipe", "Roberto", "Bruna",
        "Karla", "Carolina", "Maria", "João", "Zelia", "Mateus", "Vinicius", "Renato", "Thomas", "Larissa"
    ],
    "idade":[
        22, 10, 13, 15, 40, 62, 55, 11, 32, 19, 20, 25, 27, 22, 34, 39, 29, 24, 45, 51
    ],
    "sexo":[
        "M", "F", "F", "M", "M", "F", "M", "M", "M", "M"
        "F", "F", "F", "M", "F", "M", "M", "M", "M", "F"
    ],
    "endereco":[
        "Rua A, 25, Jua", "Rua Pedro Silva, 12, ABC", "Avenida Brasil, 33, Congal", "Rua J, 100, Cohab",
        "Travessa 23, 444, Santo Antonio", "Rua Alberta, 77, Guaruja", "Rua Teste, 9, Teste", "Vila Santana, 31, Kongara",
        "Rua A, 22, Jua", "Rua Pedro Silva, 45, ABC", "Avenida Brasil, 31, Congal", "Rua J, 10, Cohab",
        "Travessa 23, 454, Santo Antonio", "Rua Alberta, 74, Guaruja", "Rua Teste, 8, Teste", "Vila Santana, 30, Kongara",
        "Rua A, 26, Jua", "Rua Pedro Silva, 125, ABC", "Avenida Brasil, 3, Congal", "Rua J, 101, Cohab",
    ]
}

menores18_index, idade18_44_index, maiores44_index = get_idade_index_by_dict(clientes)

menores18 = get_cliente_data_by_index(menores18_index, clientes)
idade18_44 = get_cliente_data_by_index(idade18_44_index, clientes)
maiores44 = get_cliente_data_by_index(maiores44_index, clientes)

print("\n\nPessoas menores de 18 anos")
show_clientes_data(menores18)
print("\n\nPessoas entre 18 e 44 anos")
show_clientes_data(idade18_44)
print("\n\nPessoas maiores de 44 anos")
show_clientes_data(maiores44)