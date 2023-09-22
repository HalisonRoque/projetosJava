package Estudos.aprendizado;

public class ArgumentosMain {
    public static  void main (String[] args){
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Moinha altura é " + altura + "cm ");
    }
}
