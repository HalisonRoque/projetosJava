package Estudos.aprendizado.criandoExcecoes;

import Estudos.aprendizado.criandoExcecoes.CriandoExcecoes;

public class formatandoCep {
    public static void main(String[] args){
        //trando exceçoes com a função formatarCep
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CriandoExcecoes e){
            e.printStackTrace();
        }



    }
    static String formatarCep(String cep) throws CriandoExcecoes { //cria uma exceção com o THROWS
// metodo usado para a formatação do cep para uma possivel exceção
        if (cep.length() != 8)
            throw new CriandoExcecoes(); // reclica a exceção criado com o THROW

        //simulando um cep formatado
        return "23.765-064";
    }
}