/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
import java.util.Scanner;

public class ExArrays2_Consoantes {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String[] consoantes = new String[6]; //Cria um array com 6 posições para armazenar as consoantes.
int qunatidadeConsoantes = 0; //Inicializa a variável que armazena a quantidade de consoantes digitadas em 0.
int count = 0; //Inicializa a variável contador em 0.

do { 
    System.out.println("Letra: ");
    String letra = scan.next(); //Lê uma letra digitada pelo usuário.

    if ( !(letra.equalsIgnoreCase("a") | 
    letra.equalsIgnoreCase("e") | 
    letra.equalsIgnoreCase("i") | 
    letra.equalsIgnoreCase("o") | 
    letra.equalsIgnoreCase("u")) ){ //Verifica se a letra digitada é uma consoante.
        consoantes[count] = letra; //Se for uma consoante, armazena no array de consoantes.
        qunatidadeConsoantes++; //Incrementa a quantidade de consoantes digitadas.
    }

    count++; //Incrementa o contador de letras lidas.
} while(count< consoantes.length); //Executa enquanto não atingir a quantidade máxima de letras a serem lidas.

System.out.println("Consoantes: ");
for (String consoante : consoantes ) { //Percorre o array de consoantes.
    if (consoante != null) //Verifica se a posição atual do array contém uma consoante.
        System.out.print(consoante + " "); //Imprime a consoante.
}

System.out.println("Quantidade de consoantes: " + qunatidadeConsoantes); //Imprime a quantidade de consoantes digitadas.
}
}