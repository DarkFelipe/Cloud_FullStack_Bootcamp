public class Mensagem {

    public static void Saudacao(int hora){
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Olá, bom dia!");
                
                break;
            
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Olá, boa tarde!");
                    
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Olá, boa noite!");
                        
                break;
        
            default:System.out.println("Não é uma hora válida.");
                break;
        }
    }

    public static void main(String[] args) {
        Mensagem.Saudacao(5);
        Mensagem.Saudacao(14);
        Mensagem.Saudacao(22);
        Mensagem.Saudacao(4);
    }
    
}
