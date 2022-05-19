package exemplos.pessoas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

    private String nome;
    private String dataNasc;
    private int idade;

    public Pessoa() {}

    public Pessoa(String nome, String dataNasc) {
        this.setNome(nome);
        this.setDataNasc(dataNasc);
        this.setIdade(this.calcIdade());
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    private int getAnoAtual() {
        SimpleDateFormat f = new SimpleDateFormat("yyyy");
        return Integer.parseInt(f.format(new Date()));
    }

    private int getDataNascAno(String dataNasc) {
        return Integer.parseInt(dataNasc.split("/")[2]);
    }
    
    public int calcIdade() {
        return this.getAnoAtual() - this.getDataNascAno(this.getDataNasc());
    }
}
