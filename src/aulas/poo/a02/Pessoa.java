package aulas.poo.a02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
    
    private String nome;
    private int anoNasc;

    public Pessoa(){}

    public Pessoa(String nome, int anoNasc){
        this.nome = nome;
        this.anoNasc = anoNasc;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoNasc() {
        return anoNasc;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int calcIdade(){
        SimpleDateFormat f = new SimpleDateFormat("yyyy");
        return Integer.parseInt(f.format(new Date()));
    }
}
