package Estudos.contaBanco.ContaCorrente;

public class ContaCorrente {
    private int idConta;
    private String idAgencia;
    private double saldo;

    public ContaCorrente(int idConta, String idAgencia) {
        this.idConta = idConta;
        this.idAgencia = idAgencia;
    }

    public void ExibirSaldo(){
        System.out.println("saldo atual R$ " + this.saldo);
    }


    public void Depositar(int valorDeposito){
        this.saldo = this.saldo + valorDeposito;
        System.out.println("VALOR DEPOSITADO DE R$ " + this.saldo + ".");
    }
    public void Sacar(int valorSaque){
        if(this.saldo >= valorSaque){
            this.saldo = this.saldo - valorSaque;
            System.out.println("saque de R$ " + valorSaque + " realizado");
        } else{
            System.out.println("saldo insuficiente para saque");
        }
    }
}
