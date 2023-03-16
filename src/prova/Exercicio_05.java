package prova;

import java.util.Scanner;

/**
 * 05 - Escreva um programa que inverta os caracteres de um string.
 * 
 * 
 * 
 * IMPORTANTE:
 * 
 * a) Essa string pode ser informada através de qualquer entrada de sua
 * preferência ou pode ser previamente definida no código;
 * 
 * b) Evite usar funções prontas, como, por exemplo, reverse;
 * 
 * @author Germano-Silva
 *
 */
public class Exercicio_05 {

	public static void main(String[] args) {
		 try (Scanner scan = new Scanner(System.in)) {
			 
			System.out.print("Digite um nome: ");
			String nome = scan.nextLine();
			
			char[] arrayDeCaracter = nome.toCharArray();
			
			for (int i = 0; i < arrayDeCaracter.length / 2; i++) {
			    char temp = arrayDeCaracter[i];
			    arrayDeCaracter[i] = arrayDeCaracter[arrayDeCaracter.length - 1 - i];
			    arrayDeCaracter[arrayDeCaracter.length - 1 - i] = temp;
			}
			
			String nomeInvertido = new String(arrayDeCaracter);
			System.out.println("Nome invertido: " + nomeInvertido);
		}
        

	}

}
