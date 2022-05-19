package exemplos.pessoas;

public class Main {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Alan", "20/03/1998");
        System.out.println(p1.getNome() + ", sua idade é " + p1.getIdade());
    }
}
