package exercico;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		// Pedir para o usu�rio informar um dia da 
		// Semana, e retornar o n�mero do qual
		// aquele dia coresponde. Ex.: "Domingo" -> 1
		// .equalsIgnoreCase ignora letras mai�sculas e min�sculas
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o dia da semana: ");
		String DiaDaSemana = entrada.nextLine().toUpperCase().replace("�", "A").trim(); // convers�o para mai�sculo, trocando o assento e retirando os espa�os vazios
	 	
		if (DiaDaSemana.equals("DOMINGO")) {
			System.out.println("1");
		}else if (DiaDaSemana.equals("SEGUNDA")){
			System.out.println("2");
		}else if (DiaDaSemana.equals("TER�A")){
			System.out.println("3");
		}else if (DiaDaSemana.equals("QUARTA")){
			System.out.println("4");
		}else if (DiaDaSemana.equals("QUINTA")){
			System.out.println("5");
		}else if (DiaDaSemana.equals("SEXTA")){
			System.out.println("6");
		}else if ("sabado".equalsIgnoreCase(DiaDaSemana) // n�o ir� analisar mai�sculas e min�sculas
		|| "s�bado".equalsIgnoreCase(DiaDaSemana)){
			System.out.println("7");
		}else {
			System.out.println("Dia inv�lido!");
		}
		System.out.println("FINISH!");
		entrada.close();
	}

}
