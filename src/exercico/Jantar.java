package exercico;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Pizza", 0.3);
		Comida c2 = new Comida("Bolo", 0.233);
		Pessoa p = new Pessoa("Rodney", 90);
		
	System.out.println(p.apresentar());
	p.comer(c1);
	System.out.println(p.apresentar());
	p.comer(c2);
	System.out.println(p.apresentar());
	}
	

}
