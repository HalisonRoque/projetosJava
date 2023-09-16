package Estudos.aprendizado;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("digite um valor= ");
        int x = scan.nextInt();

        for(int i = 0; i <= 10; i++){
            int resul = x * i;
            System.out.println(x +" x " + i + " = " + resul);
        }
    }
}
