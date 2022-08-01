package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto (){ // Nenhum parâmetro foi passado
		
	}
	
	Produto (String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;//3 parâmetros passados, devo informar os 3 posteriormente
	}
		
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
}
