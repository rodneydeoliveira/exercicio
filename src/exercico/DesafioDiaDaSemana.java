package exercico;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		// Pedir para o usuário informar um dia da 
		// Semana, e retornar o número do qual
		// aquele dia coresponde. Ex.: "Domingo" -> 1
		// .equalsIgnoreCase ignora letras maiúsculas e minúsculas
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o dia da semana: ");
		String DiaDaSemana = entrada.nextLine().toUpperCase().replace("Á", "A").trim(); // conversão para maiúsculo, trocando o assento e retirando os espaços vazios
	 	
		if (DiaDaSemana.equals("DOMINGO")) {
			System.out.println("1");
		}else if (DiaDaSemana.equals("SEGUNDA")){
			System.out.println("2");
		}else if (DiaDaSemana.equals("TERÇA")){
			System.out.println("3");
		}else if (DiaDaSemana.equals("QUARTA")){
			System.out.println("4");
		}else if (DiaDaSemana.equals("QUINTA")){
			System.out.println("5");
		}else if (DiaDaSemana.equals("SEXTA")){
			System.out.println("6");
		}else if ("sabado".equalsIgnoreCase(DiaDaSemana) // não irá analisar maiúsculas e minúsculas
		|| "sábado".equalsIgnoreCase(DiaDaSemana)){
			System.out.println("7");
		}else {
			System.out.println("Dia inválido!");
		}
		System.out.println("FINISH!");
		entrada.close();
	}

}
