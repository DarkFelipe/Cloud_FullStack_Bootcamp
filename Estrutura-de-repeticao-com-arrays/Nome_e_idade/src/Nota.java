import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int nota1;

        while(true) {
            System.out.println("Insira uma nota: ");
            nota1 = s.nextInt();

            if (nota1>10){
                System.out.println("O valor da nota é inválido.");
            } else {
                System.out.println("OK! Valor válido.");
                break;
            }
                
        }
    }
}
