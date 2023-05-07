
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
/**

ExLoop5_Tabuada é uma classe que recebe um número inteiro informado pelo usuário
e realiza a tabuada do número informado, exibindo o resultado na tela.
A tabuada é exibida utilizando um loop for que percorre os números de 1 a 10
e realiza o cálculo da multiplicação da tabuada informada pelo número do loop.
@author Caio Bello
@version 1.0
@since 2023-05-07
*/

import java.util.Scanner;

public class ExLoop5_Tabuada {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    // Solicita que o usuário informe a tabuada que deseja obter
    System.out.println("Tabuada: ");

    // Lê o número informado pelo usuário
    int tabuada = scan.nextInt();

    // Exibe a tabuada que será calculada
    System.out.println("Tabuada de " + tabuada);

    // Loop for que percorre os números de 1 a 10 e realiza o cálculo da multiplicação
    for( int i = 1; i <= 10 ; i++ ) {

        // Exibe a operação e o resultado da multiplicação
        System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
    }
    
}
}