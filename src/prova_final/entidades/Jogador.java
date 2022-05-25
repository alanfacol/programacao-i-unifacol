package prova_final.entidades;

import java.util.ArrayList;

import atividades.entidades.voleibol.enums.EPosicao;

public class Jogador extends Atleta {
    private EPosicao posicao;
    private ArrayList<Cartao> cartoes;
    
    public EPosicao getPosicao() {
        return posicao;
    }
    public void setPosicao(EPosicao posicao) {
        this.posicao = posicao;
    }
    public ArrayList<Cartao> getCartoes() {
        return cartoes;
    }
    public void setCartoes(ArrayList<Cartao> cartoes) {
        this.cartoes = cartoes;
    }
}
