package atividades.entidades.tenis.classes;

import java.util.Date;

import atividades.entidades.tenis.enums.ESexo;

public abstract class Pessoa {
    private String nome;
    private Date dtNasc;
    private ESexo sexo;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDtNasc() {
        return dtNasc;
    }
    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }
    public ESexo getSexo() {
        return sexo;
    }
    public void setSexo(ESexo sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
