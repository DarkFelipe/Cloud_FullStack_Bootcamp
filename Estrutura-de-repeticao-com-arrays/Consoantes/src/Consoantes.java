    import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String[] consoantes = new String[6];

        int quantidadeConsoantes = 0;
        int count = 0;

        do {

            System.out.println("letra: "); // pede para inserir uma letra 
            String letra = scan.next(); // armazena as letras na variável letra

            if (! (letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase( "i") |
                letra.equalsIgnoreCase( "o") |
                letra.equalsIgnoreCase("u"))) {
                
                consoantes[count] = letra; // armazena as letras em consoantes
                quantidadeConsoantes++; // repete o laço 

            }

            count++; // repete para todas as letras inseridas
            

        } while(count < consoantes.length); // verificação da condição no final

        System.out.println("Consoantes: ");

        for(String consoante : consoantes) { // armazeno o Array Consoantes em um novo array 
            if (consoante != null){
                System.out.print(consoante + " ");
            }
        }


       

       
    }
    
}
