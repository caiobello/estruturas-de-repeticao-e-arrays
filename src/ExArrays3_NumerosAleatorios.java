

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class ExArrays3_NumerosAleatorios {
public static void main(String[] args) {
// Criação de um objeto da classe Random para gerar números aleatórios
Random random = new Random();

    // Criação de um array de inteiros com 10 posições
    int[] numerosAleatorios = new int [10];

    // Loop for que preenche o array com 10 números aleatórios entre 0-99
    for(int i = 0; i < numerosAleatorios.length; i++){
        int numero = random.nextInt(100); // Gera um número aleatório entre 0 e 99
        numerosAleatorios[i] = numero; // Atribui o número gerado à posição i do array
    }

    // Impressão dos números aleatórios gerados
    System.out.print("\nNumeros aleatorios: ");
    for (int numero : numerosAleatorios) { // Loop for each que percorre cada número do array
        System.out.print(numero + " "); // Imprime o número seguido de um espaço em branco
    }

    // Impressão dos sucessores dos números aleatórios gerados
    System.out.print("\nSucessores dos Numeros Aleatorios: ");
    for (int numero : numerosAleatorios) { // Loop for each que percorre cada número do array
        System.out.print((numero+1) + " "); // Imprime o sucessor do número (número + 1) seguido de um espaço em branco
    }
}
}