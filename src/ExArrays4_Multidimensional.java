/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class ExArrays4_Multidimensional {
public static void main(String[] args) {
// Criação de um objeto da classe Random para gerar números aleatórios
Random random = new Random();

    // Criação de uma matriz 4x4 com valores inteiros
    int[][] M = new int[4][4];

    // Loop for aninhado que preenche a matriz com valores aleatórios entre 0-8
    for(int i = 0; i < M.length; i++) {
        for( int j = 0; j < M[i].length; j++) {
            M[i][j] = random.nextInt(9); // Gera um número aleatório entre 0 e 8 e atribui à posição (i,j) da matriz
        }
    }

    // Impressão da matriz na tela
    System.out.println("Matriz: ");
    for (int[] linha : M  ) { // Loop for each que percorre cada linha da matriz
        for (int coluna : linha ) { // Loop for each que percorre cada coluna da linha atual
            System.out.print(coluna + " "); // Imprime o valor da coluna seguido de um espaço em branco
        }
        System.out.println(); // Imprime uma quebra de linha ao final de cada linha da matriz
    }

}
}