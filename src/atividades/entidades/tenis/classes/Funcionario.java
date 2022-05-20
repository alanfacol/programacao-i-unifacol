package atividades.entidades.tenis.classes;

import java.util.Date;

public class Funcionario extends Pessoa {
    
    private float salario;
    private Date dtContrato;
    private Date dtRenovacao;
    
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public Date getDtContrato() {
        return dtContrato;
    }
    public void setDtContrato(Date dtContrato) {
        this.dtContrato = dtContrato;
    }
    public Date getDtRenovacao() {
        return dtRenovacao;
    }
    public void setDtRenovacao(Date dtRenovacao) {
        this.dtRenovacao = dtRenovacao;
    }


}
