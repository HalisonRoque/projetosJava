package Estudos.contaBanco.ContaCorrente;

public class App {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1, "1");
        conta1.Depositar(100);
        conta1.ExibirSaldo();
        conta1.Depositar(200);
        conta1.ExibirSaldo();

    }
}
