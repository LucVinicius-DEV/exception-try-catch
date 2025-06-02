// estrutura basica de tratamento de excecoes

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    method1(); // chama o metodo 1

    System.out.println("Fim do programa");

  }

  public static void method1() { // metodo 1

    System.out.println("*** METODO 1 START ***"); // marca o inicio do metodo 1

    method2(); // chama o metodo 2


    System.out.println("*** METODO 1 END ***"); // marca o fim do metodo 1
  }

  public static void method2() { // metodo 2

    System.out.println("*** METODO 2 START ***"); // marca o inicio do metodo 2
    
    Scanner sc = new Scanner(System.in);

      Try { // bloco try para tratar excecoes
      String [] vect = sc.nextLine().split(" "); // le uma linha e divide em um vetor de strings
      int position = sc.nextInt(); // le um inteiro
      System.out.println("Valor na posicao: " + vect[position]); // imprime o valor na posicao lida
    }
    catch (ArrayIndexOutOfBoundsException e) { // trata excecao de posicao invalida
      System.out.println("Posicao invalida!");
      e.printStackTrace(); // imprime a pilha de chamadas do metodo
    }
    catch (InputMismatchException e) { // trata excecao de entrada invalida
      System.out.println("Entrada invalida!");
    }

      System.out.println("Fim do programa"); // imprime mensagem de fim do programa
      sc.close();

    System.out.println("*** METODO 2 END ***"); // marca o fim do metodo 2
  }

}
