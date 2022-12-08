public class Exercicio2 {
    
    public static void main(String[] args) {
        String diaSemana = "segunda-feira";

    switch (diaSemana) {
        case "segunda-feira": System.out.println("2");
            
            break;
        case "terça-feira": System.out.println("3");
            
            break;
        case "quarta-feira": System.out.println("4");
            
            break;
        case "quinta-feira": System.out.println("5");
            
            break;
        case "sexta-feira": System.out.println("6");
            
            break;
        case "sábado": System.out.println("7");
            
            break;
        case "domingo": System.out.println("1");
            
            break;
    
        default: System.out.println("Não é um dia da semana");
            break;
    }
    }
}
