/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

//quando precisar do contador utilize o for
//quando precisar de laços infinitos utilize o while


/**

Classe ExLoop6_Fatorial
Esta classe é responsável por receber um número inteiro do usuário e
calcular o fatorial desse número utilizando um loop for.
O resultado da operação é exibido no console.
@author Caio Bello
@version 1.0
*/

import java.util.Scanner;

public class ExLoop6_Fatorial {
    /**
     * Este programa calcula o fatorial de um número inteiro inserido pelo usuário.
     * O fatorial é o produto de todos os números inteiros positivos de 1 até o número em questão.
     * Por exemplo, o fatorial de 5 é 5*4*3*2*1 = 120.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicita que o usuário insira o número para o qual se deseja calcular o fatorial
        System.out.println("Digite um número para calcular o fatorial: ");
        int fatorial = scan.nextInt();
        
        int multiplicacao = 1;

        // Exibe o número para o qual se está calculando o fatorial
        System.out.print(fatorial + "! = ");

        // Executa o cálculo do fatorial, começando pelo número inserido pelo usuário
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        // Exibe o resultado do cálculo do fatorial
        System.out.println(multiplicacao);
    }
}
