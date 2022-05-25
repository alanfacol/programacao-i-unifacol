package prova_final.servicos;

import java.util.ArrayList;

import prova_final.entidades.Time;
import prova_final.interfaces.ITimeServico;
import prova_final.repositorios.TimeRepositorio;

public class TimeServico implements ITimeServico {

    private TimeRepositorio timeRepo = new TimeRepositorio();

    @Override
    public void cadastrar(Time time) {
        timeRepo.cadastrar(time);
    }

    @Override
    public void alterar(Time time) {
        timeRepo.alterar(time);
    }

    @Override
    public void deletar(Time time) {
        timeRepo.deletar(time);
    }

    @Override
    public ArrayList<Time> pesquisar(String nome) {
        return timeRepo.pesquisar(nome);
    }

    @Override
    public ArrayList<Time> listarTodos() {
        return timeRepo.listarTodos();
    }
    
}
