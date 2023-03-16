package prova;

import java.util.Scanner;

/**
 * 02 - Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
 * avisando se o número informado pertence ou não a sequência.
 * 
 * 
 * 
 * IMPORTANTE:
 * 
 * Esse número pode ser informado através de qualquer entrada de sua preferência
 * ou pode ser previamente definido no código;
 * 
 * @author Germano-Silva
 *
 */

public class Exercicio_02 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Digite um número: ");
			int numero = scan.nextInt();

			int a = 0;
			int b = 1;
			int c;

			while (b < numero) {
				c = a + b;
				a = b;
				b = c;
			}

			if (b == numero) {
				System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
			} else {
				System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
			}
		}

	}

}
