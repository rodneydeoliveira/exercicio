package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto (){ // Nenhum par�metro foi passado
		
	}
	
	Produto (String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;//3 par�metros passados, devo informar os 3 posteriormente
	}
		
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
}
