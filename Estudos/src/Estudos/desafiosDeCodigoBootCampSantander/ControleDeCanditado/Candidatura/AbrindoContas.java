package Estudos.desafiosDeCodigoBootCampSantander.ControleDeCanditado.Candidatura;

import java.util.Scanner;

public class AbrindoContas {
    public static void main(String[] args) {

        // Lendo os dados de Entrada:
        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String titular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        // invocando a classe ContaBancaria com o seu Metodo Bancaria.
        conta.Bancaria(numero, titular, saldo);
        //recebendo os valores informados com o scanner.

        System.out.println("Informacoes:");
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
        System.out.println("Conta: " + conta.numero);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: R$ " + conta.saldo);
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public void Bancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}

