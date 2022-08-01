package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4000);
		// p1.nome = "Notebook";
		p1.preco = 4000;
		// p1.desconto = 0.25;
		
		Produto.desconto = 0.29;
		
		Produto p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 4.50;
		// p2.desconto = 0.30;
		
		double precofinal1 = p1.precoComDesconto();
		System.out.println(precofinal1);
		
		System.out.println(p2.precoComDesconto());
		
	}

}
