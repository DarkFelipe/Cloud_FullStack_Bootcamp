import java.util.Random;

public class Matriz {

    public static void main(String[] args) {
        
        Random random = new Random();

        int[][] numerosAleatorios = new int[4][4];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios.length; j++) {
                numerosAleatorios[i][j] = random.nextInt(9);
            }
            
        }
        
        for(int[]linha : numerosAleatorios){
           for(int coluna: linha){
             System.out.print(coluna + " ");
           }

           System.out.println();
            
        }
    }
    
}
