package Estudos.contaBanco.ContaCorrente;

public class App {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1, "1");
        conta1.exibirSaldo();
        conta1.Depositar(50);
        conta1.Sacar(10);
        conta1.exibirSaldo();
        conta1.Sacar(40);
        conta1.exibirSaldo();
        conta1.Sacar(10);
    }
}
