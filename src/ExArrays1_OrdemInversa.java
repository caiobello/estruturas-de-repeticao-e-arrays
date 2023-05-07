/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/


/*
O programa imprime na tela um vetor de inteiros na ordem em que foi declarado e depois imprime o mesmo vetor na ordem inversa.
*/

public class ExArrays1_OrdemInversa {
    public static void main(String[] args) {
    int[] vetor = {-5, -6, 15, 50, 8, 4}; //declaração de um vetor de inteiros

    System.out.println(vetor); //imprime o endereço de memória do vetor
    System.out.println(vetor.length); //imprime o tamanho do vetor
    System.out.println("Vetor: "); //imprime uma mensagem indicando que será impresso o vetor

    int count = 0;
    while(count < (vetor.length)) { //imprime cada elemento do vetor na ordem em que foi declarado
        System.out.print(vetor[count] + " ");
        count++;
    }

    System.out.println("\nVetor: "); //imprime uma mensagem indicando que o vetor será impresso na ordem inversa
    for(int i = (vetor.length -1); i >= 0; i--){ //imprime cada elemento do vetor na ordem inversa
        System.out.print(vetor[i] + " ");
    }

}}
