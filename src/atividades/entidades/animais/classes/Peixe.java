package atividades.entidades.animais.classes;

import atividades.entidades.animais.enums.EAgua;
import atividades.entidades.animais.enums.EEscamaPeixe;

public class Peixe extends Animal {
    private String corEscama;
    private EEscamaPeixe tipoEscama;
    private EAgua tipoAgua;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public EEscamaPeixe getTipoEscama() {
        return tipoEscama;
    }

    public void setTipoEscama(EEscamaPeixe tipoEscama) {
        this.tipoEscama = tipoEscama;
    }

    public EAgua getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(EAgua tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Peixe");

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
