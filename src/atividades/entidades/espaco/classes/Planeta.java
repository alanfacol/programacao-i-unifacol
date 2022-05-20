package atividades.entidades.espaco.classes;

import atividades.entidades.espaco.enums.EAtmosfera;
import atividades.entidades.espaco.interfaces.IPlaneta;

public class Planeta extends CorpoCeleste implements IPlaneta {
    private EAtmosfera[] elemAtmosfera;
    private float vlcRotacao, dstRotacao;
    private float vlcTranslacao, dstTranslacao;
    private boolean temAgua;

    public EAtmosfera[] getElemAtmosfera() {
        return elemAtmosfera;
    }

    public void setElemAtmosfera(EAtmosfera[] elemAtmosfera) {
        this.elemAtmosfera = elemAtmosfera;
    }

    public float getVlcRotacao() {
        return vlcRotacao;
    }

    public void setVlcRotacao(float vlcRotacao) {
        this.vlcRotacao = vlcRotacao;
    }

    public float getVlcTranslacao() {
        return vlcTranslacao;
    }

    public void setVlcTranslacao(float vlcTranslacao) {
        this.vlcTranslacao = vlcTranslacao;
    }

    public float getDstRotacao() {
        return dstRotacao;
    }

    public void setDstRotacao(float dstRotacao) {
        this.dstRotacao = dstRotacao;
    }

    public float getDstTranslacao() {
        return dstTranslacao;
    }

    public void setDstTranslacao(float dstTranslacao) {
        this.dstTranslacao = dstTranslacao;
    }

    public boolean isTemAgua() {
        return temAgua;
    }

    public void setTemAgua(boolean temAgua) {
        this.temAgua = temAgua;
    }

    @Override
    public float calcTempoRotacao() {
        return this.getDstRotacao() / this.getVlcRotacao();
    }
    
    @Override
    public float calcTempoTranslacao() {
        return this.getDstTranslacao() / this.getVlcTranslacao();
    }

}
