package classe;

public class AreaCirc {  // Atributos de uma classe, o que o objeto possui.
	double raio;        // Nesse caso, o objeto Area, possui raio e pi.
	static final double PI =  3.14;
	
	AreaCirc(double raioInicial) {  // Métodos (funções) da Classe. Quais são os
									// comportamentos desse objeto, o que devo fazer 
		raio = raioInicial;			// com seus atributos.
	}
	double area () {
		return PI * Math.pow(raio, 2);
		
		
		
		}
		static double area(double raio) {
			return PI * (Math.pow(raio, 2));
	}
	
}
