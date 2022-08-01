package exercico;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		// Calcule a média das notas de uma turma
		// não sabemos o número de alunos
		// o usuário vai digitar uma nota de 0 a 10, armazenar a nota 
		// em uma variável chamada "total"
		// sempre que uma nota for digitada, ela será acrescentada a var "total"
		// contar quantas notas válidas forem acrescentadas
		// repetir isso até o usuário digitar SAIR
		// calcular a média
		
		Scanner entrada = new Scanner (System.in);
		
		double total = 0;
		double media = 0;
		int notasValidas = 0;
		double nota = 0;
		
		do {
		System.out.println("Digite uma nota válida ou -1 p/ sair: ");
		nota = entrada.nextDouble();
		
		if (nota >=0 && nota <=10) {
			total += nota;
			notasValidas++;
			}
		else if (nota != -1){
			System.out.println("nota inválida!");
		}
		}while (nota != -1);
		
		media = total/notasValidas;
		
		System.out.printf("O total de notas válidas foram %d %n"
				+ "A soma entre as notas válidas foi de %.2f %n"
				+ "A média das notas foi de %.2f", notasValidas, total, (media));
		
		entrada.close();

		}
		
}
