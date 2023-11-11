package Estudos.contaBanco.ContaCorrente;

public class ContaCorrente {
    private int idConta;
    private String idAgencia;
    private double saldo;

    public ContaCorrente(int idConta, String idAgencia) {
        this.idConta = idConta;
        this.idAgencia = idAgencia;
    }

    public void exibirSaldo(){
        System.out.println("saldo atual R$ " + this.saldo);
    }
    public void Depositar(int valorDeposito){
        this.saldo = this.saldo + valorDeposito;
        System.out.println("seu saldo é R$ " + this.saldo + ".");
    }
    public void Sacar(int valorSaque){
        if(this.saldo >= 0){
            this.saldo = this.saldo - valorSaque;
            System.out.println("saque de R$ " + valorSaque + " realizado");
        } else{
            System.out.println("saldo insuficiente para saque");
        }
    }
}
