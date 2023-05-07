/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

// Importação da classe Scanner para leitura de entrada pelo teclado
import java.util.Scanner;

// Definição da classe ExLoop1_NomeEIdade
public class ExLoop1_NomeEIdade {
    // Método principal main
public static void main(String[] args) {
    
    // Criação de um objeto da classe Scanner para leitura de entrada pelo teclado
    Scanner scan = new Scanner(System.in);

    // Declaração de duas variáveis, uma para o nome e outra para a idade
    String nome;
    int idade;

    // Início do laço while com condição verdadeira (true)
    while (true) {
        System.out.println("Nome: "); // Imprime mensagem pedindo para digitar o nome
        nome = scan.next(); // Lê o nome digitado
        if (nome.equals("0")) // Se o nome digitado for "0", o laço é interrompido com o break
            break;
        System.out.println("Idade: "); // Imprime mensagem pedindo para digitar a idade
        idade = scan.nextInt(); // Lê a idade digitada
    }
    
    System.out.println("Laço anterior interrompindo"); // Imprime mensagem indicando que o laço anterior foi interrompido
}
}