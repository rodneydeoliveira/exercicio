package controle;

public class Continue {
		public static void main(String[] args) {
			
			for(int i = 0; i <= 10; i ++) {
				if (i==5) {
					continue; // ir� continuar o la�o, at� encontrar 
					// a condi��o de sa�da.
				}
				System.out.println(i);
			}
			
			
		}
}
