package prova_ii_unidade;

import prova_ii_unidade.entidades.Quadrado;

public class Main {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado.calcDiagonal());
    }
}
