package exercico;

import java.util.Scanner;

public class MediaDeSalariosExe {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o primeiro salário");
		String valor1 = entrada.nextLine().replace(',', '.');
		System.out.println("Digite o segundo salário");
		String valor2 = entrada.nextLine().replace(',', '.');
		System.out.println("Digite o terceiro salário");
		String valor3 = entrada.nextLine().replace(',', '.');
		
		double sal1 = Double.parseDouble(valor1);
		double sal2 = Double.parseDouble(valor2);
		double sal3 = Double.parseDouble(valor3);
		
		double media = (sal1 + sal2 + sal3) /3;
		
		
		System.out.printf("O salário 1 é de %.2f %n"
				+ "O salário 2 é de %.2f %n"
				+ "O salário 3 é de %.2f. A média é de %.2f", sal1, sal2, sal3, media);
	}
}
