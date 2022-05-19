package atividades.entidades.animais.classes;

import atividades.entidades.animais.enums.EPenas;

public class Ave extends Animal {
    private EPenas tipoPenas;
    private String corPenas;
    private float compAsas;

    public EPenas getTipoPenas() {
        return tipoPenas;
    }

    public void setTipoPenas(EPenas tipoPenas) {
        this.tipoPenas = tipoPenas;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }

    public float getCompAsas() {
        return compAsas;
    }

    public void setCompAsas(float compAsas) {
        this.compAsas = compAsas;
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Ave");

    }

    @Override
    public void comer() {
        System.out.println("Por ser um " + this.getAlimentacao().name().toLowerCase() + ", ele esta " + this.getAlimentacao().getDesc());
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
