package Estudos.sistemaSmartTv;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();
        Scanner scan = new Scanner(System.in);

        System.out.println("TV ligada = " + smartTv.ligada);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.mudarCanal(31);
        smartTv.aumentarVolume();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("canal atual " + smartTv.canal);
    }
}
