import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
        
       Random random = new Random();

       int[] numerosAleatorios = new int[20];

       for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);

            numerosAleatorios[i] = numero;
       }

       System.out.print("O vetor é: ");
       for (int vetor : numerosAleatorios){
        
        System.out.print(vetor + " ");
       }

       System.out.print("\nOs sucesssores do vetor são: ");

       for (int sucessor: numerosAleatorios){
        System.out.print((sucessor+1) + " ");
       }



        
           
        
        
    }
    
}
