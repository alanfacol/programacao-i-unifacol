package atividades.entidades.religiao;

import atividades.entidades.religiao.classes.Cristianismo;
import atividades.entidades.religiao.enums.ECrenca;

public class Main {
    public static void main(String[] args) {
        Cristianismo c = new Cristianismo();
        c.setNome("Cristianismo Ortodoxo");
        c.setCrenca(ECrenca.MONOTEISMO);
        c.setDivindade("Jesus");
        c.setQtdSeguidores(2000000000l);
    }
}
