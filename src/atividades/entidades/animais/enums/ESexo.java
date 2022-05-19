package atividades.entidades.animais.enums;

public enum ESexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String desc;

    ESexo (String sexo){
        this.desc = sexo;
    }

    public String getDesc(){
        return this.desc;
    }
}