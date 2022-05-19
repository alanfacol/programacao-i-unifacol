package aulas.basico.aula04;

public class ForEach {
    public static void main(String[] args) {
        
        // Verificador de maioridade

        int[] idades = new int[20];

        for(int x = 0; x < idades.length; x++){
            idades[x] = (int) (Math.random() * 100);
        }        

        for(int idade : idades){
            if (idade >= 18){
                System.out.println("Você é de maior, já que tem " + idade + " anos");
            } else {
                System.out.println("Para a idade de " + idade + "anos, ainda não atingiu a maioridade");
            }
        }
    }
}
