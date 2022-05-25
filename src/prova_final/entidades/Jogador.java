package prova_final.entidades;

import java.util.ArrayList;

import prova_final.enums.EPosicao;

public class Jogador extends Atleta {
    private EPosicao posicao;
    private ArrayList<Cartao> cartoes;

    public Jogador() {
    }

    public Jogador(String nome, String cpf, EPosicao posicao) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setPosicao(posicao);
        this.cartoes = null;
    }

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
