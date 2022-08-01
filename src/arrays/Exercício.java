package arrays;

import java.util.Arrays;

public class Exercício {
	public static void main(String[] args) {
		double [] notasAlunoA = new double[3];
		notasAlunoA [0] = 7.0;
		notasAlunoA [1] = 6.8;
		notasAlunoA [2] = 8.9;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for (int i = 0; i <notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
			System.out.println(totalAlunoA);
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double [] notasAlunoB = {7.8, 8.9, 5.8, 9.0};
		
		double totalAlunoB = 0;
	for (int i = 0; i < notasAlunoB.length; i++) {
		totalAlunoB += notasAlunoB[i];
	}
	
	System.out.println(totalAlunoB / notasAlunoB.length);
	}
	
	
	

}
