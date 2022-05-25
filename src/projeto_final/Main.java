package projeto_final;

import java.util.ArrayList;

import projeto_final.entidades.Jogador;
import projeto_final.entidades.Tecnico;
import projeto_final.entidades.Time;
import projeto_final.enums.EPosicao;
import projeto_final.servicos.TimeServico;

public class Main {
    public static void main(String[] args) {
        // Criação dos Jogadores
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(new Jogador("Alan", "11111111111", EPosicao.ATACANTE));
        jogadores.add(new Jogador("Bruno", "22222222222", EPosicao.MEIA));
        jogadores.add(new Jogador("Cesar", "33333333333", EPosicao.DEFENSOR));
        jogadores.add(new Jogador("Daniel", "44444444444", EPosicao.GOLEIRO));

        // Criação do técnico
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Lazaro do Sertão");

        // Criação do time
        Time t1 = new Time();
        t1.setNome("Sport");
        t1.setJogadores(jogadores);
        t1.setTecnico(tecnico);
        t1.setVitorias(0);
        t1.setEmpates(0);
        t1.setDerrotas(0);

        // Chamada do serviço
        TimeServico timeServico = new TimeServico();
        timeServico.cadastrar(t1);

        // Alterando o nome do time pelo seu objeto
        ArrayList<Time> timesBusca = timeServico.pesquisar("Sport");
        for (Time time : timesBusca) {
            time.setNome("Sport Recife");
            timeServico.alterar(time);
            break;
        }

        // Listando os times
        ArrayList<Time> teste = timeServico.listarTodos();

        for (Time time : teste) {
            System.out.println(time.getNome());
            System.out.println(time.getTecnico().getNome());
        }
    }
}
