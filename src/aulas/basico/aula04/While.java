package aulas.basico.aula04;

public class While {
    public static void main(String[] args) {
        
        // Verificador de números pares
        int[] numeros = new int[20];
        int limite = numeros.length - 1;

        for(int x = 0; x < numeros.length; x++){
            numeros[x] = (int) (Math.random() * 100);
        }

        while(limite >= 0){
            if (numeros[limite] % 2 == 0) {
                System.out.println("O número " + numeros[limite] + " é par");
            }
            limite--;
        }
    }
}
