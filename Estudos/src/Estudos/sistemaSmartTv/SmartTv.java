package Estudos.sistemaSmartTv;

public class SmartTv {
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
        System.out.println("Aumentar o Volume Para = " + volume);
    }

    public void diminiurVolume(){
        volume--;
        System.out.println("Diminuir o Volume Para = " + volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("CANAL " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("CANAL " + canal);
    }
    public void mudarCanal(int novoCanal){
        if(novoCanal <= 30){
            this.canal = novoCanal;
            System.out.println("CANAL " + canal);
        }else{
            System.out.println("CANAL NÃO ENCONTRADO.");
        }

    }
}
