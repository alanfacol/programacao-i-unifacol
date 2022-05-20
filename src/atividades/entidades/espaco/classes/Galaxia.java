package atividades.entidades.espaco.classes;

import java.util.ArrayList;

import atividades.entidades.espaco.enums.ETipoGalaxia;

public class Galaxia {
    private String nome;
    private long idade;
    private ETipoGalaxia tipo;
    private ArrayList<Estrela> estrelas;
    private ArrayList<Planeta> planetas;
    private ArrayList<Asteroide> asteroides;
    private ArrayList<Cometa> cometas;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getIdade() {
        return idade;
    }
    public void setIdade(long idade) {
        this.idade = idade;
    }
    public ETipoGalaxia getTipo() {
        return tipo;
    }
    public void setTipo(ETipoGalaxia tipo) {
        this.tipo = tipo;
    }
    public ArrayList<Estrela> getEstrelas() {
        return estrelas;
    }
    public void setEstrelas(ArrayList<Estrela> estrelas) {
        this.estrelas = estrelas;
    }
    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }
    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }
    public ArrayList<Asteroide> getAsteroides() {
        return asteroides;
    }
    public void setAsteroides(ArrayList<Asteroide> asteroides) {
        this.asteroides = asteroides;
    }
    public ArrayList<Cometa> getCometas() {
        return cometas;
    }
    public void setCometas(ArrayList<Cometa> cometas) {
        this.cometas = cometas;
    }

    
}
