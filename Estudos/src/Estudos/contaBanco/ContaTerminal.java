package Estudos.contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String cliente;
        double saldo;
        Linha();

        System.out.println("BEM VINDO AO NOSSO BANCO! \nPOR FAVOR DIGITE O NUMERO DE SUA AGÊNCIA: ");
        agencia = scanner.nextLine();
        Linha();

        System.out.println("DIGITE O NUMERO DE SUA CONTA: ");
        numeroConta = scanner.nextInt();
        Linha();

        System.out.println("DIGITE SEU NOME: ");
        scanner.nextLine();
        cliente = scanner.nextLine();
        Linha();

        System.out.println("DIGITE SEU SALDO: ");
        saldo = scanner.nextDouble();
        Linha();


        System.out.println("Olá " + cliente.toUpperCase() + "\nObrigado por criar uma conta em nosso banco. \nSua agência é " + agencia + "\nConta: " + numeroConta + "\nE seu saldo de " + saldo + "ja está disponivel para saque.");
    }
    static void Linha(){
        System.out.println("========================");
    }
}
