package aulas.poo.a01;

public class Main {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro(4, 4, 300);
        int pneus = c1.getQtdPneus();

        System.out.println(pneus);
    }
}
