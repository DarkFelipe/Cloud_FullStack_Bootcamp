import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        int numero;
        int count = 0;
        int par = 0;
        int impar = 0;
        int num = 0;
        
        System.out.println("Qual a quantidade de números que você deseja: ");
        numero = n.nextInt();

        
        do{
            
            System.out.println("Insira um número: ");
            num = n.nextInt();
            count++;

            if (num%2==0){
                par++;
            } else {
                impar++;
            }
                         

        } while(count < numero);

        System.out.println("A quantidade de pares é: "+par);
        System.out.println("A quantidade de ímpares é: "+impar);




        

    }
}
