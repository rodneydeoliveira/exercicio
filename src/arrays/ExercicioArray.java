package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quantas notas deseja informar? ");
		int quantidadeDeNotas = entrada.nextInt();
		
		double[] notas = new double [quantidadeDeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i+1));
			notas [i] = entrada.nextDouble();	
		}
		double soma = 0;
		for (double nota: notas) {
			soma += nota;
		}
		System.out.println(Arrays.toString(notas));
		System.out.println(soma);
		
		double media = (soma / quantidadeDeNotas);
		System.out.print(media);
		entrada.close();
		
	
	
	}
}
