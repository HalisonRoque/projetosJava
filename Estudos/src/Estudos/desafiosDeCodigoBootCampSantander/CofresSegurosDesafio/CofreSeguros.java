package Estudos.desafiosDeCodigoBootCampSantander.CofresSegurosDesafio;

import java.util.Scanner;



abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    //contrutor da classe pai
    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }
    //metodo imprimir
    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}




// classe filha extends classe pai
class CofreDigital extends Cofre {

    private int senha;
    //contrutor da classe CofreDigital
    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }
    //metodo validarSenha
    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }

    public void imprimirInformacoes(){
        super.imprimirInformacoes();
    }
}



//classe filha extends da classe pai
class CofreFisico extends Cofre {
    //contrutor da classe CofreFisico
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
        //super.imprimirInformacoes();
    }

    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        //System.out.println("Tipo: " + this.tipo);
        //System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}





//codigo principal
public class CofreSeguros {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        //CofreFisico fisico = new CofreFisico();
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            int confirmacaoSenha = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha);

            if (cofreDigital.validarSenha(confirmacaoSenha)) {
                cofreDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            } else {
                //System.out.println("Tipo: " + cofreDigital.tipo);
                //System.out.println("Metodo de abertura: " + cofreDigital.metodoAbertura);
                cofreDigital.imprimirInformacoes();
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        } else {
            System.out.println("Tipo de cofre invalido");
        }
        //if (tipoCofre.equalsIgnoreCase("fisico")){
        //fisico.imprimirInformacoes();
        //}
    }
}

