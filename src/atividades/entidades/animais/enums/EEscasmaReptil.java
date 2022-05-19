package atividades.entidades.animais.enums;

public enum EEscasmaReptil {

    QUERATINA("Queratina"),
    OSSEA("Ossear");

    private String desc;

    private EEscasmaReptil(String esc) {
        this.desc = esc;
    }

    public String getDesc(){
        return this.desc;
    }
}
