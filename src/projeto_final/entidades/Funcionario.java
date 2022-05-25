package projeto_final.entidades;

import java.util.Date;

public class Funcionario extends Pessoa {
    private float salario;
    private String setor;
    private Date dataContrato;
    private Date dataRenovacao;
    private int anosContrato;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
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
