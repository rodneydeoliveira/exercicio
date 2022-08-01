package controle;

public class For1 {
	public static void main(String[] args) {
		
		// Modo mais comum da estrutura FOR
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println("c = " + contador);
		}
		// Forma menos usual da estrutura FOR
		int contador2 = 0;
		for (;contador2 <= 10;) {
			System.out.println("c2 = " + contador2);
			contador2++;
		}
	}

}
