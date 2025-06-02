// estrutura basica de tratamento de excecoes

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Try { // bloco try para tratar excecoes
    String [] vect = sc.nextLine().split(" "); // le uma linha e divide em um vetor de strings
    int position = sc.nextInt(); // le um inteiro
    System.out.println("Valor na posicao: " + vect[position]); // imprime o valor na posicao lida
  }
  catch (ArrayIndexOutOfBoundsException e) { // trata excecao de posicao invalida
    System.out.println("Posicao invalida!");
  }
  catch (InputMismatchException e) { // trata excecao de entrada invalida
    System.out.println("Entrada invalida!");
  }

    System.out.println("Fim do programa"); // imprime mensagem de fim do programa

    sc.close();
  }
}
