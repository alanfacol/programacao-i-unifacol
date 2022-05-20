package atividades.entidades.espaco.classes;

import atividades.entidades.espaco.enums.ETipoCauda;

public class Cometa extends CorpoCeleste{
    private ETipoCauda tipoCauda;

    public ETipoCauda getTipoCauda() {
        return tipoCauda;
    }

    public void setTipoCauda(ETipoCauda tipoCauda) {
        this.tipoCauda = tipoCauda;
    }

    
}
