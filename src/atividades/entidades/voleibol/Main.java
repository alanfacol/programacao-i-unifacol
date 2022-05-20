package atividades.entidades.voleibol;

import atividades.entidades.voleibol.classes.Bola;
import atividades.entidades.voleibol.classes.Juiz;
import atividades.entidades.voleibol.classes.Partida;
import atividades.entidades.voleibol.classes.Time;

public class Main {

    public static void main(String[] args) {
        Partida jogo1 = new Partida();
        Time casa = new Time();
        Time visitante = new Time();
        Juiz juiz = new Juiz();
        Bola bola = new Bola();
        
        jogo1.setQuadra(casa.getQuadra());
        jogo1.setTimeCasa(casa);
        jogo1.setTimeVisitante(visitante);
        jogo1.setJuiz(juiz);
        jogo1.setBola(bola);
        jogo1.iniciar();
    }
}
