itens = {
    "animais":[
        "cavalo", "coelho", "vaca", "boi", "cachorro", "gato", "tartaruga", "leao", "tigre", "onça"
    ],
    "alimentos":[
        "feijao", "arroz", "frango", "miojo", "amendoin", "banana", "ovo", "leite", "pão", "queijo"
    ],
    "veiculos":[
        "carro", "moto", "bicicleta", "caminhão", "carreta", "avião", "lancha", "helicoptero", "quadriciclo", "navio"
    ],
    "artistas":[
        "latino", "gustavo lima", "djavan", "marilia mendonça", "alceu valença", "tierre", "leandro hassum", "toni ramos", "leonardo", "zeca pagodinho"
    ],
    "eletronicos":[
        "computador", "celular", "televisao", "monitor", "mouse", "teclado", "calculadora", "ar condicionado", "ventilador", "cafeteira"
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
            