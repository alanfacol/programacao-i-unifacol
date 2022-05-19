package atividades.entidades.animais.classes;

import java.util.Date;

import atividades.entidades.animais.enums.EAlimentacao;
import atividades.entidades.animais.enums.ELocomocao;
import atividades.entidades.animais.enums.EReproducao;
import atividades.entidades.animais.enums.ESexo;
import atividades.entidades.animais.interfaces.IAnimal;

public abstract class Animal implements IAnimal {
    private String nome;
    private String cor;
    private ESexo sexo;
    private Date dtNascimento;
    private int qtdMembros;
    private ELocomocao locomocao;
    private EAlimentacao alimentacao;
    private EReproducao reproducao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public ESexo getSexo() {
        return sexo;
    }
    public void setSexo(ESexo sexo) {
        this.sexo = sexo;
    }
    public Date getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public int getQtdMembros() {
        return qtdMembros;
    }
    public void setQtdMembros(int qtdMembros) {
        this.qtdMembros = qtdMembros;
    }
    public ELocomocao getLocomocao() {
        return locomocao;
    }
    public void setLocomocao(ELocomocao locomocao) {
        this.locomocao = locomocao;
    }
    public EAlimentacao getAlimentacao() {
        return alimentacao;
    }
    public void setAlimentacao(EAlimentacao alimentacao) {
        this.alimentacao = alimentacao;
    }
    public EReproducao getReproducao() {
        return reproducao;
    }
    public void setReproducao(EReproducao reproducao) {
        this.reproducao = reproducao;
    }
    
}
