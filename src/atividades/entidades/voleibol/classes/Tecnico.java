package atividades.entidades.voleibol.classes;

import atividades.entidades.voleibol.interfaces.IResultado;

public class Tecnico extends Funcionario implements IResultado {
    private Time time;
    private int premios;
    private int vitorias;
    private int empates;
    private int derrotas;

    public int getPremios() {
        return premios;
    }

    public void setPremios(int premios) {
        this.premios = premios;
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

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
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
