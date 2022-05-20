package atividades.entidades.tenis.classes;

import atividades.entidades.tenis.interfaces.IPartida;

public class Partida implements IPartida {
    private Quadra quadra;
    private Jogador jogadorCasa;
    private Jogador jogadorVisitante;
    private Bola bola;
    private Juiz juiz;

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public Jogador getJogadorCasa() {
        return jogadorCasa;
    }

    public void setJogadorCasa(Jogador jogadorCasa) {
        this.jogadorCasa = jogadorCasa;
    }

    public Jogador getJogadorVisitante() {
        return jogadorVisitante;
    }

    public void setJogadorVisitante(Jogador jogadorVisitante) {
        this.jogadorVisitante = jogadorVisitante;
    }

    public Bola getBola() {
        return bola;
    }

    public void setBola(Bola bola) {
        this.bola = bola;
    }

    public Juiz getJuiz() {
        return juiz;
    }

    public void setJuiz(Juiz juiz) {
        this.juiz = juiz;
    }

    private boolean validar() {
        if ((this.getJogadorCasa() == null && this.getJogadorVisitante() == null)
                && this.getQuadra() == null && this.getJuiz() == null && this.getBola() == null) {
                    return false;
        } else {
            return true;
        }
    }

    @Override
    public void iniciar() {
        if(validar()){
            System.out.println("A partida foi iniciada");
        } else {
            System.out.println("Partida não pode ser iniciada");
        };
    }

    @Override
    public void terminar() {
        System.out.println("Partida foi encerrada");
    }

}
