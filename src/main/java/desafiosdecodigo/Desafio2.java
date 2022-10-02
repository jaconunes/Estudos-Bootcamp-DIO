package desafiosdecodigo;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        int A, N;
        int soma = 0;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        for(int i = 0; i <= N; i++){
          //  soma = soma + (A * i);
            if(i % A == 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);
    }
}
