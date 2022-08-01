package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// if (...) sentença; ou {}
		// while (...) sentença; ou {}
		// for (var;expr;modificação da var) sentença; ou {}
		// Do while - bloco de código {} -> expressão ();
		// do {} while (expressão);
		
		Scanner entrada = new Scanner (System.in);
		
		String texto = "";
		
		do {
			System.out.println("Digite as palavras mágicas...");
			texto = entrada.nextLine().trim();
		}while 
			
			(!texto.equalsIgnoreCase("por favor"));
	}
}
