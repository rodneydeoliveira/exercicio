package controle;

public class SwitchSemCase {
	public static void main(String[] args) {
		String faixa = "laranja";
		//  Se não colocarmos o break, o programa vai executar 
		// tudo que estiver abaixo do valor que foi definido
		
		switch (faixa.toLowerCase()) {
		case "preta": // Caso seja preta, exiba...
			System.out.println("Sei o Bassai Dan...");
		case "marrom" :
			System.out.println("Sei o Tekki Shodan");
		case "roxa" :
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Seu o Heian Shodan");
			break; // Não irá executar oq vier abaixo
		default: // Caso contrário...
			System.out.println("Sei de nada...");
		}
		System.out.println("Fim");
	}

}
