/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/


/**

O programa ExLoop4_ParEImpar recebe a quantidade de números a serem lidos do usuário,
em seguida, solicita que o usuário digite cada número e determina quantos números pares e
quantos números ímpares foram digitados.
*/
import java.util.Scanner;
public class ExLoop4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
    
    
        int quantidadeNumeros;
        int contador = 0;
        int numero;
        int quantPares = 0; 
        int quantImpares = 0;
    
        //Solicita ao usuário a quantidade de números a serem lidos
        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();
        
    
        do {
            //Solicita ao usuário que digite um número
            System.out.println("Número: ");
            numero = scan.nextInt();
    
            //Verifica se o número digitado é par ou ímpar e incrementa a quantidade correspondente
            if (numero % 2 == 0) quantPares++;
            else quantImpares++;
    
    
            contador = contador + 1;
        } while(contador < quantidadeNumeros);
    
        //Exibe a quantidade de números pares e a quantidade de números ímpares
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impares: " + quantImpares);
    }
}    