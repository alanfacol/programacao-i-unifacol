package atividades.entidades.animais.enums;

public enum ELocomocao {
    ANDAR("andando..."),
    NADAR("nadando..."),
    RASTEJANDO("rastejando...");

    private String desc;

    ELocomocao(String loc){
        this.desc = loc;
    }

    public String getDesc(){
        return this.desc;
    }
}
