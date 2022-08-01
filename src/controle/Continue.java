package controle;

public class Continue {
		public static void main(String[] args) {
			
			for(int i = 0; i <= 10; i ++) {
				if (i==5) {
					continue; // irá continuar o laço, até encontrar 
					// a condição de saída.
				}
				System.out.println(i);
			}
			
			
		}
}
