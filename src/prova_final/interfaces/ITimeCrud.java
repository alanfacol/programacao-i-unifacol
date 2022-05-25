package prova_final.interfaces;

import java.util.ArrayList;

import prova_final.entidades.Time;

public interface ITimeCrud {
    public abstract void cadastrar(Time time);

    public abstract void alterar(Time time);

    public abstract void deletar(Time time);

    public abstract ArrayList<Time> pesquisar(String nome);

    public abstract ArrayList<Time> listarTodos();
}
