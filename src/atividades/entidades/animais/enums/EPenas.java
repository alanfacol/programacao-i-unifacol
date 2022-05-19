package atividades.entidades.animais.enums;

public enum EPenas {
    TETRIZES("Tetrizes"),
    PLUMULAS("Plúmulas"),
    VOO("Võo"),
    FILOPLUMAS("Filoplumas e cerdas");

    private String desc;

    private EPenas(String p){
        this.desc = p;
    }

    public String getDesc(){
        return this.desc;
    }
}
