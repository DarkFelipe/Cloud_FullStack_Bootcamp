public class SmartTV {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("O volume foi aumentado para: "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("O volume diminuiu para: "+volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
            canal = novoCanal;
    }
}
