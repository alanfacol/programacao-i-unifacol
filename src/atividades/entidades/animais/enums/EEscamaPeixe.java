package atividades.entidades.animais.enums;

public enum EEscamaPeixe {
    CICLOIDES("Cicloides"),
    CTENOIDES("Ctenoides"),
    GENOIDES("Genoides"),
    PACLOIDES("Placoides");

    private String desc;

    private EEscamaPeixe(String esc){
        this.desc = esc;
    }

    public String getDesc(){
        return this.desc;
    }
}
