package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// if (...) senten�a; ou {}
		// while (...) senten�a; ou {}
		// for (var;expr;modifica��o da var) senten�a; ou {}
		// Do while - bloco de c�digo {} -> express�o ();
		// do {} while (express�o);
		
		Scanner entrada = new Scanner (System.in);
		
		String texto = "";
		
		do {
			System.out.println("Digite as palavras m�gicas...");
			texto = entrada.nextLine().trim();
		}while 
			
			(!texto.equalsIgnoreCase("por favor"));
	}
}
