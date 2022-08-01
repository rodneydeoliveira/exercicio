package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String resposta = "";
		
		while (!resposta.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			resposta = entrada.nextLine();
		}
		entrada.close();
	}
}
