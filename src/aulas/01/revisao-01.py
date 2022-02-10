itens = {
    "Animais":[
        "Cavalo", "Coelho", "Vaca"
    ],
    "Alimentos":[
        "Feijao", "Arroz", "Carne"
    ],
    "Veiculos":[
        "Carro", "Moto", "Bicicleta"
    ],
    "Artistas":[
        "Latino", "Gustavo Lima", "Djavan"
    ],
    "Eletronicos":[
        "Computador", "Celular", "Televisao"
    ]
}

resposta = input("Informe a palavra desejada: ")
flag = False
lista = None
item = None
palavra = None

for item in itens:
    for item_ in itens[item]:
        if resposta.upper() == item_.upper():
            flag = True
            lista = item
            palavra = item_
            break

if flag:
    print(f'A resposta {resposta} for encontrado na lista "{lista}"')
else:
    print(f'A resposta {resposta} não foi encontrada em nenhuma lista')
            