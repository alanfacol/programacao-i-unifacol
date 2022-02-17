itens = {
    "animais":[
        "cavalo", "coelho", "vaca", ""
    ],
    "alimentos":[
        "feijao", "arroz", "carne"
    ],
    "veiculos":[
        "carro", "moto", "bicicleta"
    ],
    "artistas":[
        "latino", "gustavo lima", "djavan"
    ],
    "eletronicos":[
        "computador", "celular", "televisao"
    ]
}

resposta = input("Informe a palavra desejada: ")
flag = False
lista = None
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
            