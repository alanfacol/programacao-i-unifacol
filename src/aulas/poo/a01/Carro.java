package aulas.poo.a01;

public class Carro extends Veiculo {

    private int qtdPortas;
    private int litrosMala;

    public Carro (){}

    public Carro (int qtdPortas){
        this.setQtdPortas(qtdPortas);
    }

    public Carro (int qtdPortas, int qtdPneus){
        this.setQtdPortas(qtdPortas);
        this.setQtdPneus(qtdPneus);
    }

    public Carro (int qtdPortas, int qtdPneus, int litrosMala){
        this.setQtdPortas(qtdPortas);
        this.setQtdPneus(qtdPneus);
        this.setLitrosMala(litrosMala);
    }

    public int getQtdPortas() {
        return qtdPortas;
    }
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    public int getLitrosMala() {
        return litrosMala;
    }
    public void setLitrosMala(int litrosMala) {
        this.litrosMala = litrosMala;
    }
    
}
