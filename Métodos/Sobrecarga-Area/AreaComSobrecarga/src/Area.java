public class Area {

    public static void calcularArea(double lado){
        System.out.println("O valor da Área do quadrado é: "+lado*lado);
    }

    public static void calcularArea(double lado1, double lado2){
        System.out.println("O valor da área do retângulo é: "+lado1*lado2);
    }
    
    public static void calcularArea (double baseMaior, double baseMenor, double altura){
        System.out.println("O valor da área do trapézio é: "+((baseMaior+baseMenor)*altura)/2);
    }

    public static void main(String[] args) {
        Area.calcularArea(5);
        Area.calcularArea(40, 25, 12);
        Area.calcularArea(5, 12);
    }
}
