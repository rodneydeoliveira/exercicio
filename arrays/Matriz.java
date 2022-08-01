package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quantidade de alunos: ");
		int quantidadeDeALunos = entrada.nextInt();
		
		System.out.println("Quantidade de notas por aluno: ");
		int quantidadeDeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double [quantidadeDeALunos][quantidadeDeNotas];
		
		double total = 0;
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", (n+1), (a+1));
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];				
			}
	}	
		double media = total / (quantidadeDeALunos * quantidadeDeNotas);
		
		System.out.println(media);
		System.out.println(Arrays.toString(notasDaTurma));
		entrada.close();
			
	}
}


