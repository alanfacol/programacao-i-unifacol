package prova_ii_unidade.entidades;

public abstract class Quadrilatero {
    final private int QTD_LADOS = 4;
    private double[] lados;
    private double perimetro;
    private double area;
    private double diagonal;

    public double[] getLados() {
        return lados;
    }

    public void setLados(double[] lados) {
        this.lados = lados;
    }

    public int getLADOS() {
        return QTD_LADOS;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

}