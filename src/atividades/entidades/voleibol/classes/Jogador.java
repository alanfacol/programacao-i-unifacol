package atividades.entidades.voleibol.classes;

import atividades.entidades.voleibol.enums.EPosicao;
import atividades.entidades.voleibol.interfaces.IResultado;

public class Jogador extends Funcionario implements IResultado {

    private EPosicao posicao;
    private int vitorias;
    private int empates;
    private int derrotas;

    public EPosicao getPosicao() {
        return posicao;
    }

    public void setPosicao(EPosicao posicao) {
        this.posicao = posicao;
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
