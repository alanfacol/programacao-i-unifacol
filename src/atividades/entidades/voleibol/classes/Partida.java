package atividades.entidades.voleibol.classes;

import atividades.entidades.voleibol.interfaces.IPartida;

public class Partida implements IPartida {
    private Quadra quadra;
    private Time timeVisitante;
    private Time timeCasa;
    private Bola bola;
    private Juiz juiz;

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(Time timeCasa) {
        this.timeCasa = timeCasa;
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
        if ((this.getTimeCasa() == null && this.getTimeVisitante() == null)
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
