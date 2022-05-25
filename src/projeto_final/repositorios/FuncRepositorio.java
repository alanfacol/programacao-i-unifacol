package projeto_final.repositorios;

import java.util.ArrayList;

import projeto_final.entidades.Funcionario;
import projeto_final.interfaces.IFuncCrud;

public class FuncRepositorio implements IFuncCrud {
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>(); 

    @Override
    public void cadastrar(Funcionario func) {
        funcionarios.add(func);
    }

    @Override
    public void alterar(Funcionario func) {
        
    }

    @Override
    public void deletar(Funcionario func) {
        
    }

    @Override
    public ArrayList<Funcionario> pesquisar(String nome) {
        return null;
    }

    @Override
    public ArrayList<Funcionario> listarTodos() {
        return null;
    }
    
}
