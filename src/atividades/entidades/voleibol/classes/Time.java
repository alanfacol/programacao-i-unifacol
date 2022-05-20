package atividades.entidades.voleibol.classes;

import java.util.ArrayList;

import atividades.entidades.voleibol.interfaces.IResultado;

public class Time implements IResultado{

    private ArrayList<Jogador> jogadores;
    private Tecnico tecnico;
    private Quadra quadra;
    private int partidas;
    private int vitorias;
    private int empates;
    private int derrotas;

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

    public int getPartidas() {
        return partidas;
    }

    private void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra estadio) {
        this.quadra = estadio;
    }

    public void inserirPartida(){
        this.setPartidas(this.getPartidas() + 1);
    }

    @Override
    public void empatar() {
        this.setEmpates(this.getEmpates() + 1);
    }

    @Override
    public void vencer() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perder() {
        this.setDerrotas(this.getDerrotas() + 1);
    }


}
