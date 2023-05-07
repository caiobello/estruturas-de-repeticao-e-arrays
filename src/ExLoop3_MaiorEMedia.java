/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

/**

Classe que solicita a entrada de 5 números inteiros e imprime o maior e a média
*/
import java.util.Scanner;

public class ExLoop3_MaiorEMedia {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int numero; // variável que armazena o número digitado pelo usuário
int contador = 0; // variável que controla o número de vezes que o laço foi executado
int maior = 0; // variável que armazena o maior número digitado pelo usuário
int soma = 0; // variável que armazena a soma de todos os números digitados pelo usuário

do { 
    System.out.println("numero: ");
    numero = scan.nextInt();
    if (numero > maior) maior = numero; // se o número digitado for maior que o atual maior número armazenado, atualiza a variável "maior"
    soma = soma + numero; // soma o número digitado à variável "soma"
    contador = contador +1; // incrementa a variável "contador" em 1
} while(contador < 5); // repete o laço enquanto o contador for menor que 5

System.out.println("Maior numero: " + maior); // imprime o maior número digitado
System.out.println("Média: " + soma/5); // imprime a média dos números digitados
}
}