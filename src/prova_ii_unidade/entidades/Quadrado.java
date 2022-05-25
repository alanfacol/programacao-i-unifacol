package prova_ii_unidade.entidades;

import prova_ii_unidade.interfaces.IFigura;

public class Quadrado extends Quadrilatero implements IFigura {

    public Quadrado() {
    }

    public Quadrado(double lado) {
        double[] lados = new double[4];
        for (int x = 0; x < this.getLADOS(); x++) {
            lados[x] = lado;
        }
        this.setLados(lados);
    }

    @Override
    public double calcArea() {
        return this.getLados()[0] * this.getLados()[0];
    }

    @Override
    public double calcPerimetro() {
        return this.getLados()[0] * this.getLADOS();
    }

    @Override
    public double calcDiagonal() {
        return Math.sqrt(Math.pow(this.getLados()[0], 2) + Math.pow(this.getLados()[0], 2));
    }

}
