package atividades.entidades.animais.enums;

public enum EAlimentacao {
    HERBIVORO("comendo plantas"),
    CARNIVORO("comendo carne"),
    ONIVORO("comendo ovos");

    private String desc;

    private EAlimentacao(String alim){
        this.desc = alim;
    }

    public String getDesc(){
        return this.desc;
    }
}
