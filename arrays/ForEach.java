package arrays;

public class ForEach {
	public static void main(String[] args) {
		double[] notas = {9.7, 6.8, 9.8, 8.6};
	
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println();
		for (double nota: notas) {
			System.out.println(nota);
		}
	}
}
