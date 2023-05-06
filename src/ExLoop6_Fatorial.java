/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

//quando precisar do contador utilize o for
//quando precisar de laços infinitos utilize o while

import java.util.Scanner;

public class ExLoop6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Farotial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
