import javax.sound.sampled.SourceDataLine;

public class Calculadora {


    public static void somar(int num1, int num2) {
        
        int soma = num1+num2;
        System.out.println("O resultado da soma de "+num1+" + "+num2+" é: "+soma);

    }

    public static void multiplicar(int num1, int num2) {
        
        int multiplicar = num1*num2;
        System.out.println("O resultado da multiplicação de "+num1+" * "+num2+" é: "+multiplicar);

    }
    
    public static void subtrair(int num1, int num2) {
        
        int subtrair = num1-num2;
        System.out.println("O resultado da subtração de "+num1+" - "+num2+" é: "+subtrair);

    }

    public static void dividir(int num1, int num2) {
        
        int dividir = num1/num2;
        System.out.println("O resultado da divisão de "+num1+" / "+num2+" é: "+dividir);

    }

   
    public static void main(String[] args) {
              
        Calculadora.somar(4,5);
        Calculadora.multiplicar(7,8);
        Calculadora.dividir(8,2);
        Calculadora.subtrair(5,15); 
    }
}
