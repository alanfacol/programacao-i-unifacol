package atividades.entidades.religiao.classes;

import atividades.entidades.religiao.enums.ECrenca;

public class Religiao {
    private String nome;
    private long qtdSeguidores;
    private String divindade;
    private ECrenca crenca;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public long getQtdSeguidores() {
        return qtdSeguidores;
    }
    public void setQtdSeguidores(long qtdSeguidores) {
        this.qtdSeguidores = qtdSeguidores;
    }
    public String getDivindade() {
        return divindade;
    }
    public void setDivindade(String divindade) {
        this.divindade = divindade;
    }
    public ECrenca getCrenca() {
        return crenca;
    }
    public void setCrenca(ECrenca crenca) {
        this.crenca = crenca;
    }

    
}
