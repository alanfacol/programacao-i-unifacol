package aulas.poo.aula01;

public abstract class Veiculo {
    
    private String marca;
    private String modelo;
    private int valor;
    private int qtdPneus;

    public int getQtdPneus() {
        return qtdPneus;
    }
    public void setQtdPneus(int qtdPneus) {
        this.qtdPneus = qtdPneus;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}
