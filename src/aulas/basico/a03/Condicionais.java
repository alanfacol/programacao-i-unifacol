package aulas.basico.a03;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        String cor_semaforo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a cor do semaforo");
        cor_semaforo = scan.nextLine();
        scan.close();

        // Jeito 01
        // if (cor_semaforo.equals("vermelho")){
        //     System.out.println("A cor escolhida é " + cor_semaforo);
        // }
        // if (cor_semaforo.equals("amarelo")){
        //     System.out.println("A cor escolhida é " + cor_semaforo);
        // }
        // if (cor_semaforo.equals("verde")){
        //     System.out.println("A cor escolhida é " + cor_semaforo);
        // }
        // else {
        //     System.out.println("A cor informada não bate com as cores de um semaforo");
        // }

        // Jeito 02
        // if (cor_semaforo.equals("vermelho")){
        //     System.out.println("A cor escolhida é " + cor_semaforo);
        // } else {
        //     if (cor_semaforo.equals("amarelo")){
        //         System.out.println("A cor escolhida é " + cor_semaforo);
        //     } else {
        //         if (cor_semaforo.equals("verde")){
        //             System.out.println("A cor escolhida é " + cor_semaforo);
        //         } else {
        //             System.out.println("A cor informada não bate com as cores de um semaforo");
        //         }
        //     }
        // }

        // Jeito 03
        if (cor_semaforo.equals("vermelho")){
            System.out.println("A cor escolhida é " + cor_semaforo);
        } else if (cor_semaforo.equals("amarelo")){
            System.out.println("A cor escolhida é " + cor_semaforo);
        }else if (cor_semaforo.equals("verde")){
            System.out.println("A cor escolhida é " + cor_semaforo);
        } else {
            System.out.println("A cor informada não bate com as cores de um semaforo");
        }
    }
}
