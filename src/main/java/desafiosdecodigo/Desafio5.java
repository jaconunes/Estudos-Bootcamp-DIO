package desafiosdecodigo;

import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int entrada = leitor.nextInt();
        String resultado = null;

        for (int i = 0; i < elementos.length; i++) {
            if (entrada == elementos[i]) {
               resultado = "Achei " + entrada + " na posição " + i;
               break;
            } else {
                resultado = "Numero " + entrada + " nao encontrado!";
            }
        }
        
        System.out.println(resultado);
    }

}
