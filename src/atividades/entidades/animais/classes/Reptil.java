package atividades.entidades.animais.classes;

import atividades.entidades.animais.enums.EEscasmaReptil;

public class Reptil extends Animal {
    private String corEscama;
    private EEscasmaReptil tipoEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public EEscasmaReptil getTipoEscama() {
        return tipoEscama;
    }

    public void setTipoEscama(EEscasmaReptil tipoEscama) {
        this.tipoEscama = tipoEscama;
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Reptil");
    }

    @Override
    public void comer() {
        System.out.println("Por ser um " + this.getAlimentacao().name().toLowerCase() + ", ele esta "
                + this.getAlimentacao().getDesc());
    }

    @Override
    public void reproduzir() {
        System.out.println("Este animal é do tipo " + this.getReproducao().getDesc());

    }

    @Override
    public void locomover() {
        System.out.println("Este animal se locomove " + this.getLocomocao().getDesc());

    }

}
