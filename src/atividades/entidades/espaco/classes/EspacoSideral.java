package atividades.entidades.espaco.classes;

import java.util.ArrayList;

public class EspacoSideral {
    private float dimensao;
    private ArrayList<Galaxia> galaxias;
    
    public float getDimensao() {
        return dimensao;
    }
    public void setDimensao(float dimensao) {
        this.dimensao = dimensao;
    }
    public ArrayList<Galaxia> getGalaxias() {
        return galaxias;
    }
    public void setGalaxias(ArrayList<Galaxia> galaxias) {
        this.galaxias = galaxias;
    }

    
}
