package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite sua nota: ");
		double media = entrada.nextDouble();
		
		if (media >= 7.0 && media <=10) {
			System.out.println("Aprovado!");
		}
		else if (media >= 5.0 && media <7.0) {
			System.out.println("Recuperação!");
		}
		
		else if (media <5.0 && media >= 0) {
			System.out.println("Reprovado!");
		}
		else {
			System.out.println("Opção inválida! ");
		}
		entrada.close();
		
		
	}

}
