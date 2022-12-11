

public class OrdemInversa {

    public static void main(String[] args) {
        
        int vetor [] = {1,2,3,4,5,6};
        System.out.print("Vetor: ");

        for (int i = 0; i < vetor.length; i++) {
            int ordem [] = vetor;
            System.out.print(ordem[i] + " ");
        }

        System.out.print("\nVetor com ordem inversa: ");
        for (int i = (vetor.length - 1); i >= 0 ; i--) {
            int ordemInversa [] = vetor;
            System.out.print(ordemInversa[i] + " ");
            
        }
    }
    
    
}
