package aulas.poo.a02;

public class Main {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Alan", 1998);
        int idade = p1.calcIdade();

        System.out.println("Idade: " + idade);
    }
    
}
