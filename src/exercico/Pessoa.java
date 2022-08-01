package exercico;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa (String nome, double peso) {
		
		this.nome = nome;
		this.peso = peso;
		
	}
	void comer (Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
		
	}
	String apresentar () {
		return "Olá, eu sou o " + nome + ", eu tenho" + peso + "Kgs.";
		
	}
}
