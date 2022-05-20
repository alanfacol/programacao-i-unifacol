package atividades.entidades.espaco;

import java.util.ArrayList;

import atividades.entidades.espaco.classes.EspacoSideral;
import atividades.entidades.espaco.classes.Galaxia;
import atividades.entidades.espaco.classes.Planeta;
import atividades.entidades.espaco.enums.EAtmosfera;
import atividades.entidades.espaco.enums.ETipoGalaxia;

public class Main {
    public static void main(String[] args) {
        EspacoSideral espaco = new EspacoSideral();
        espaco.setDimensao(1030120301203.98f);

        Galaxia viaLactia = new Galaxia();
        viaLactia.setNome("Via Lactia");
        viaLactia.setIdade(123123123012394l);
        viaLactia.setTipo(ETipoGalaxia.ESPIRAL);
        
        Planeta terra = new Planeta();
        terra.setNome("Terra");
        terra.setIdade(4500000000l);
        terra.setDiametro(12742);
        terra.setMassa(5972000000000000000l);
        terra.setVlcRotacao(1669);
        terra.setDstRotacao(40056);
        terra.setTemAgua(true);

        EAtmosfera[] elemsAtmosferaTerra = new EAtmosfera[3];
        elemsAtmosferaTerra[0] = EAtmosfera.OXIGENIO;
        elemsAtmosferaTerra[1] = EAtmosfera.NITROGENIO;
        elemsAtmosferaTerra[2] = EAtmosfera.HIDROGENIO;
        
        terra.setElemAtmosfera(elemsAtmosferaTerra);
        System.out.println(terra.calcTempoRotacao());

        viaLactia.setPlanetas(new ArrayList<Planeta>());
        viaLactia.getPlanetas().add(terra);
        espaco.setGalaxias(new ArrayList<Galaxia>());
        espaco.getGalaxias().add(viaLactia);
    }
}
