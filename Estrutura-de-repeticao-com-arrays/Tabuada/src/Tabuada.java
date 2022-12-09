import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero; // declaração do número
        
        
        

        System.out.println("Digite o número: ");
        numero = scan.nextInt(); // armazenamento do número que será feito a tabuada

        for (int i = 0; i <= 10; i++) {
            
           
            System.out.println("A tabuada do número "+numero+" é:"+numero*i); // número*i é o número multiplicado pelas interações de i.
            
        }

        


    }   
}
