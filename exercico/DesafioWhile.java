package exercico;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// Calcule a m�dia das notas de uma turma
		// n�o sabemos o n�mero de alunos
		// o usu�rio vai digitar uma nota de 0 a 10, armazenar a nota 
		// em uma vari�vel chamada "total"
		// sempre que uma nota for digitada, ela ser� acrescentada a var "total"
		// contar quantas notas v�lidas forem acrescentadas
		// repetir isso at� o usu�rio digitar SAIR
		// calcular a m�dia
		
		Scanner entrada = new Scanner (System.in);
		
		double total = 0;
		double media = 0;
		int notasValidas = 0;
		double nota = 0;
		
		do {
		System.out.println("Digite uma nota v�lida ou -1 p/ sair: ");
		nota = entrada.nextDouble();
		
		if (nota >=0 && nota <=10) {
			total += nota;
			notasValidas++;
			}
		else if (nota != -1){
			System.out.println("nota inv�lida!");
		}
		}while (nota != -1);
		
		media = total/notasValidas;
		
		System.out.printf("O total de notas v�lidas foram %d %n"
				+ "A soma entre as notas v�lidas foi de %.2f %n"
				+ "A m�dia das notas foi de %.2f", notasValidas, total, (media));
		
		entrada.close();

		}
		
}
