package atividades.entidades.animais.enums;

public enum EReproducao {
    VIVIPAROS("Viviparos"),
    OVIPAROS("Oviparos"),
    OVOVIVIPAROS("Ovoviviparos");

    private String desc;

    EReproducao(String rep){
        this.desc = rep;
    }

    public String getDesc(){
        return this.desc;
    }
}
