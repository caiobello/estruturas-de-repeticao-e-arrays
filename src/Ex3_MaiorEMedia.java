/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;


        do { 
            System.out.println("numero: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;
            soma = soma + numero;
            contador = contador +1;
        } while(contador < 5);

        System.out.println("Maior numero: " + maior);
        System.out.println("Média: " + soma/5);







    }
}