package Inferencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenceExemplo {
    public static void main(String[] args) throws IOException {
    printaSoma(5, 5, 5);
    }

        public static void connectionAndPrintURLJavaOracle() throws IOException{
        var url = new URL("https://www.oracle.com/database/");
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }
    public static void testar(String nome, String sobrenome){
        var nomeCompleto = String.format("%s, %s", nome,sobrenome);
        System.out.println(nomeCompleto);


    }
    public static void printaSoma(int... numeros){
        int soma;
        if (numeros.length > 0){
            soma = 0;
            for(var numero = 0; numero < numeros.length; numero++){
                soma +=numeros[numero];
            //for(int numero : numeros){ Vou usar o for interativo invés de enhaced for
                //soma +=numero;
            }
            System.out.println("A soma é ::: " + soma);
        }
    }

}

