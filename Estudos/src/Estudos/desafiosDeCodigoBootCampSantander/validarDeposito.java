package Estudos.desafiosDeCodigoBootCampSantander;

import java.util.Scanner;


public class validarDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double valor = scanner.nextDouble();
        double saldo = 0;
        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            saldo = saldo + valor;
            System.out.printf("Deposito realizado com sucesso!\n Saldo atual: R$ %.2f%n ", saldo);
            //calculo do valor de deposito somando com o saldo.
            //(printf FORMATADO PARA DUAS CASAS DECIMAIS COM O %.2f%n).
        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Encerrando o programa...");
        } else {
            //TODO: Imprimir a mensagem de encerrar o programa.
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
    }
}
