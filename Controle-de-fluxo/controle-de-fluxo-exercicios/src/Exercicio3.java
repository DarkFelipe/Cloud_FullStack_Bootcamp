public class Exercicio3 {
    public static void main(String[] args) {
        int numero = 4;

        switch (numero) {
            case 1: 
            case 2: 
            case 3: 
                System.out.println("Certo!");    
                break;
                  
          
            case 4: System.out.println("Errado");
                
                break;
            case 5: System.out.println("Talvez");
                
                break;
                  
            default: System.out.println("Digite um número de 1 a 5");
                break;
        }
    }
    
}
