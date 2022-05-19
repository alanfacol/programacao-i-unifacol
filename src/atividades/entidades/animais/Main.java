package atividades.entidades.animais;

import java.util.Date;

import atividades.entidades.animais.enums.EAlimentacao;
import atividades.entidades.animais.enums.ELocomocao;
import atividades.entidades.animais.enums.EReproducao;
import atividades.entidades.animais.enums.ESexo;

public class Main {

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.setNome("Ricardo");
        c1.setCor("Caramelo");
        c1.setCorPelo("Alaranjada");
        c1.setDtNascimento(new Date());
        c1.setQtdMembros(4);
        c1.setSexo(ESexo.MASCULINO);
        c1.setLocomocao(ELocomocao.ANDAR);
        c1.setAlimentacao(EAlimentacao.CARNIVORO);
        c1.setReproducao(EReproducao.VIVIPAROS);

        c1.comer();
        c1.locomover();
        c1.reproduzir();
        c1.emitirSom();
    }
}
