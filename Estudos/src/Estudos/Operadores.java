package Estudos;

public class Operadores {
    public static void main(String[] args){
        int numero = 5;
// numero positivo com o sinal (-) deixa o numero negativo, se não tiver outras operações relacionadas
        numero = - numero;
// print o valor de numero.
        System.out.println(numero);
// o numero permanece negativo pois a variavel numero ja vem negativa, e o ssinal de (+) nesse caso não trasnforma em um numero positivo
        numero = + numero;
        System.out.println(numero);
// para transformar em positivo devemos fazer uma multiplicação simples.
        numero = numero * -1;

        System.out.println(numero);

        // OPERADORES DE ATRIBUIÇÃO
        System.out.println(++ numero);
// o ++ incrementa o valor em 1 a variavel, ou -1 na variavel com --.

        boolean variavel = true;
        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);



    }
}
