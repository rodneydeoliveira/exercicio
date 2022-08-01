package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc (10); // Intanciei o objeto, e coloquei o valor do raio
		System.out.println(a.area());
		
		
		System.out.println();
		System.out.println(AreaCirc.area(7)); // Acessei o método da classe diretamente
	}										  // sem criar nenhuma instância

}
