package controle;

public class For3Escopo {
	public static void main(String[] args) {
		
		// int i = 0; Nesse caso, eu consigo acessar a variável i depois do laço
		// pois ela está fora do escopo local do for
		for (int i = 0; i <10; i++ ) {
			for( int j = 0; j <10; j++) {
			System.out.printf("i = %d %nj= %d %n", i, j);
			}
		
		}
	}
}