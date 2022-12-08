import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        
        int numero;
        int maior = 0; // como não tem nenhum valor digitado ainda, estou dizendo que o maior valor inicial é 0.
        int soma = 0;
        int count = 0; // essa varíavel serve como contador, aumentando uma unidade por interação.

        do {
            System.out.println("Digite o número:");
            numero = n1.nextInt();
            count++;
            soma = soma+numero;

            if (numero > maior) maior = numero; 
               
            

        } while(count < 5);

        System.out.println("O maior número é: " +maior); //colocando aqui fora, só imprime depois que o laço terminar.

        double media = (soma)/5;
        System.out.println("A média é: "+media);
    }
}
