package desafiosdecodigo;

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        if(num1 == num2){
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }

    }
}
