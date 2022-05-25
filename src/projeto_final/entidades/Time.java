package projeto_final.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Time {
    private String nome;
    private Date dtFormacao;
    private ArrayList<Jogador> jogadores;
    private Tecnico tecnico;
    private int vitorias;
    private int empates;
    private int derrotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtFormacao() {
        return dtFormacao;
    }

    public void setDtFormacao(Date dtFormacao) {
        this.dtFormacao = dtFormacao;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

}
