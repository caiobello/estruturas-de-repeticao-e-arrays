import java.util.Scanner;

/**
 * Este programa solicita a entrada de uma nota de 0 a 10 pelo usuário,
 * e executa um loop enquanto a nota for inválida. Ao final, exibe a nota válida.
 */
import java.util.Scanner;

public class ExLoop2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // cria um objeto Scanner para ler a entrada do usuário

        int nota; // declara a variável nota como inteiro
        
        System.out.println("Nota: "); // exibe a mensagem para o usuário digitar a nota
        nota = scan.nextInt(); // lê a nota digitada pelo usuário

        while(nota < 0 || nota > 10){ // enquanto a nota for inválida (fora do intervalo de 0 a 10) repete o loop
            System.out.println("Nota inválida, digite novamente: "); // exibe mensagem de erro para o usuário
            nota = scan.nextInt(); // lê a nova nota digitada pelo usuário
        }
        
        System.out.println("A nota foi: " + nota); // exibe a nota válida
    }
}