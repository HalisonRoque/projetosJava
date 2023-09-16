package Estudos.desafiosDeCodigoBootCampSantander;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class organizandoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList < String > ativos = new ArrayList < > ();

        //Entrada dos tipos de ativos
        int quantidadeAtivos = scanner.nextInt();

        // Entrada dos códigos dos ativos
        String codigoAtivo = "";
        for (int i = 0; i <= quantidadeAtivos; i++) {
            codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
            //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.

        }
        Collections.sort(ativos); //organiza o array em ondem alfabética
        //TODO: Ordenar os ativos em ordem alfabética.

        //for utilizado para imprimir o array em linhas separadas
        //para isso devemos declarar outra variavel em um for.
        for(String ativo : ativos){
            System.out.println(ativo.toUpperCase());
        }

    }
}
