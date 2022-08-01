package exercico;

import java.util.Scanner;

public class DesafioFundamentos {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		System.out.println("digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		System.out.println("digite a operação: ");
		String op = entrada.next();
		entrada.close();
		
		
	if (op.equals("+")) {
		System.out.println(num1 + num2);}
	else if (op.equals("-")) {
			System.out.println(num1 - num2);}
	else if (op.equals("*")) {
			System.out.println(num1 * num2);}
	else if (op.equals("/")) {
		System.out.println(num1 / num2);
		
	
	}
		
	
	}



		
	}


