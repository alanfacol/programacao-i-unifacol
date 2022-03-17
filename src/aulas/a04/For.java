package aulas.a04;

import java.util.Arrays;

public class For {
    public static void main(String[] args) {
        
        // Invertendo um array

        int[] num = new int[20];
        int[] num_invertido = new int[20];

        for(int x = 0; x < num.length; x++){
            num[x] = (int) (Math.random() * 100);
        }

        for(int x = (num.length - 1); x >= 0; x--){
            num_invertido[(num.length - 1) - x] = num[x];
        }
        
        System.out.println("Array anterior: " + Arrays.toString(num));
        System.out.println("Array invertido: " + Arrays.toString(num_invertido));
    }
}
