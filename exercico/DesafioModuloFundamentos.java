package exercico;

import java.util.Scanner;

public class DesafioModuloFundamentos {
	public static void main(String[] args) {
		// Ler num1, num2, escolher a operação (+ - * / %) e exibir o resultado
		
		Scanner entrada =  new Scanner (System.in);
		System.out.print("Digite o numero 1: ");
		double num1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		System.out.print("Informe a operação: ");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1 , op , num2 , resultado);
		
		entrada.close();
		
	}

}
