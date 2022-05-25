package projeto_final.repositorios;

import java.util.ArrayList;

import projeto_final.entidades.Funcionario;
import projeto_final.interfaces.IFuncCrud;

public class FuncRepositorio implements IFuncCrud {
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    @Override
    public void cadastrar(Funcionario func) {
        funcionarios.add(func);
    }

    @Override
    public void alterar(Funcionario func) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.equals(func)) {
                funcionarios.set(funcionarios.lastIndexOf(funcionario), func);
            }
        }
    }

    @Override
    public void deletar(Funcionario func) {
        funcionarios.remove(func);
    }

    @Override
    public ArrayList<Funcionario> pesquisar(String nome) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)){
                funcionarios.add(funcionario);
            }
        }
        return funcionarios;
    }

    @Override
    public ArrayList<Funcionario> listarTodos() {
        return funcionarios;
    }

}
