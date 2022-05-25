package prova_final.entidades;

import java.util.Date;

import prova_final.enums.ECartao;

public class Cartao {
    private ECartao cartao;
    private Date dtAplicacao;
    private Date dtRevogacao;
    private boolean isRevogado;

    public ECartao getCartao() {
        return cartao;
    }

    public void setCartao(ECartao cartao) {
        this.cartao = cartao;
    }

    public Date getDtAplicacao() {
        return dtAplicacao;
    }

    public void setDtAplicacao(Date dtAplicacao) {
        this.dtAplicacao = dtAplicacao;
    }

    public Date getDtRevogacao() {
        return dtRevogacao;
    }

    public void setDtRevogacao(Date dtRevogacao) {
        this.dtRevogacao = dtRevogacao;
    }

    public boolean isRevogado() {
        return isRevogado;
    }

    public void setRevogado(boolean isRevogado) {
        this.isRevogado = isRevogado;
    }
}
