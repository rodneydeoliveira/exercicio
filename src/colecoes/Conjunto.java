package colecoes;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conjunto {
	public static void main(String[] args) {
		
		SortedSet<String> lista = new TreeSet<>(); // organiza o set em ordem
		lista.add("Pedro");
		lista.add("Luca");
		lista.add("Rodney");
		lista.add("Lucas");
		
		for (String candidato: lista) {
			System.out.println(candidato);
		}
		
	}

}
