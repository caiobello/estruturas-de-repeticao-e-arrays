/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int quantidadeNumeros;
        int contador = 0;
        int numero;
        int quantPares = 0; 
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();
        

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;


            contador = contador + 1;
        } while(contador < quantidadeNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impares: " + quantImpares);
    }

}
