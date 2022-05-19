package atividades.entidades.animais.enums;

public enum EAgua {
    SALGADA("Salgada"),
    DOCE("Doce");

    private String desc; 

    private EAgua(String ag){
        this.desc = ag;
    }

    public String getDesc(){
        return this.desc;
    }
}
