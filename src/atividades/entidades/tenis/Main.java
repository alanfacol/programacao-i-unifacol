package atividades.entidades.tenis;

import atividades.entidades.tenis.classes.Bola;
import atividades.entidades.tenis.classes.Jogador;
import atividades.entidades.tenis.classes.Juiz;
import atividades.entidades.tenis.classes.Partida;
import atividades.entidades.tenis.classes.Quadra;

public class Main {

    public static void main(String[] args) {
        Partida jogo1 = new Partida();
        Quadra quadraTenis = new Quadra();
        Jogador casa = new Jogador();
        Jogador visitante = new Jogador();
        Juiz juiz = new Juiz();
        Bola bola = new Bola();

        jogo1.setQuadra(quadraTenis);
        jogo1.setJogadorCasa(casa);
        jogo1.setJogadorVisitante(visitante);
        jogo1.setJuiz(juiz);
        jogo1.setBola(bola);
        jogo1.iniciar();
    }
}
