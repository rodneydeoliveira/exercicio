package exercico;

import java.util.Scanner;

public class MediaDeSalariosExe {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o primeiro sal�rio");
		String valor1 = entrada.nextLine().replace(',', '.');
		System.out.println("Digite o segundo sal�rio");
		String valor2 = entrada.nextLine().replace(',', '.');
		System.out.println("Digite o terceiro sal�rio");
		String valor3 = entrada.nextLine().replace(',', '.');
		
		double sal1 = Double.parseDouble(valor1);
		double sal2 = Double.parseDouble(valor2);
		double sal3 = Double.parseDouble(valor3);
		
		double media = (sal1 + sal2 + sal3) /3;
		
		
		System.out.printf("O sal�rio 1 � de %.2f %n"
				+ "O sal�rio 2 � de %.2f %n"
				+ "O sal�rio 3 � de %.2f. A m�dia � de %.2f", sal1, sal2, sal3, media);
	}
}
