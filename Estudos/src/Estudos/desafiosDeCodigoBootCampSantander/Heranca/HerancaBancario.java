package Estudos.desafiosDeCodigoBootCampSantander.Heranca;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HerancaBancario {
    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numero = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numero, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    //cosntrutor da classe - classe pai
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}
//classe herdada da classe pai "ContaBancaria"
class ContaPoupanca extends ContaBancaria { //uso do extends infomando que essa é uma classe filha comum a classe pai.
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        //TODO: Implementar adequadamente esta sobrecarga de construtores.
        super(numero, titular, saldo); //chamada do cosntrutor da classe pai "ContaBancaria"
        this.taxaJuros = taxaJuros;
    }
    //metodo para exibir informações.
    public void exibirInformacoes() {
        super.exibirInformacoes(); //o "super" esta referenciando o metodo ja criado, e infomando que vai acrescentar mais um parametro.
        //TODO: Complementar as informações com a taxa de juros.
        //acrescentando mais uma informação ao metodo.
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
}
