package projeto_final.servicos;

import java.util.ArrayList;

import projeto_final.entidades.Time;
import projeto_final.interfaces.ITimeCrud;
import projeto_final.repositorios.TimeRepositorio;

public class TimeServico implements ITimeCrud {

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
