package arrays;

import java.util.Arrays;

public class ExercicioForeach {
	public static void main(String[] args) {
		
	
	double[] notasAlunoA = new double[3];
	notasAlunoA [0] = 7.0;
	notasAlunoA [1] = 6.8;
	notasAlunoA [2] = 8.9;
	
	System.out.println(Arrays.toString(notasAlunoA));
	
	double totalAlunoA = 0;
	for (double notaA: notasAlunoA) {
		totalAlunoA += notaA;
		System.out.println(totalAlunoA);
	}
	
	System.out.println(totalAlunoA / notasAlunoA.length);
	
	double [] notasAlunoB = {7.8, 8.9, 5.8, 9.0};
	
	double totalAlunoB = 0;
for (double notaB: notasAlunoB) {
	totalAlunoB += notaB;
}

System.out.println(totalAlunoB / notasAlunoB.length);
}
}