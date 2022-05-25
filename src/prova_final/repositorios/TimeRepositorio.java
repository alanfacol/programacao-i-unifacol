package prova_final.repositorios;

import java.util.ArrayList;

import prova_final.entidades.Time;
import prova_final.interfaces.ITimeRepo;

public class TimeRepositorio implements ITimeRepo {
    private ArrayList<Time> timeRepo = new ArrayList<Time>();

    @Override
    public void cadastrar(Time time) {
        timeRepo.add(time);
    }

    @Override
    public void alterar(Time time) {
        for (Time t : timeRepo) {
            if (t.equals(time)){
                timeRepo.set(timeRepo.lastIndexOf(t), time);
            }
        }
    }

    @Override
    public void deletar(Time time) {
        timeRepo.remove(time);
    }

    @Override
    public ArrayList<Time> pesquisar(String nome) {
        ArrayList<Time> times = new ArrayList<Time>();
        for (Time time : timeRepo) {
            if (time.getNome().equals(nome)){
                times.add(time);
            }
        }
        return times;
    }

    @Override
    public ArrayList<Time> listarTodos() {
        return timeRepo;
    }

}
