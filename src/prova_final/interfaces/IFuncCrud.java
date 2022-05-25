package prova_final.interfaces;

import java.util.ArrayList;

import prova_final.entidades.Funcionario;

public interface IFuncCrud {
    public abstract void cadastrar(Funcionario func);

    public abstract void alterar(Funcionario func);

    public abstract void deletar(Funcionario func);

    public abstract ArrayList<Funcionario> pesquisar(String nome);

    public abstract ArrayList<Funcionario> listarTodos();
}
