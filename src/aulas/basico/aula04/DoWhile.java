package aulas.basico.aula04;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        // Média de 5 notas
        double[] notas = new double[5];
        int limite = notas.length - 1;
        double media, soma = 0;

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Informe o valor da " + (notas.length - limite) + "ª nota: ");
            notas[limite] = scan.nextDouble();

            soma += notas[limite];
            limite--;

        } while (limite >= 0);

        scan.close();

        media = soma / notas.length;

        System.out.println("A média das notas é: " + media);
    }
}
