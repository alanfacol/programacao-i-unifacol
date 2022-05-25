package prova_final.entidades;

import java.util.Date;

public class Funcionario extends Pessoa {
    private float salario;
    private Date dataContrato;
    private Date dataRenovacao;
    private int anosContrato;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Date getDataRenovacao() {
        return dataRenovacao;
    }

    public void setDataRenovacao(Date dataRenovacao) {
        this.dataRenovacao = dataRenovacao;
    }

    public int getAnosContrato() {
        return anosContrato;
    }

    public void setAnosContrato(int anosContrato) {
        this.anosContrato = anosContrato;
    }
}
