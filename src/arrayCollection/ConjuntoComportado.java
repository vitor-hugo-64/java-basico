package arrayCollection;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		// DECLARA UM SET QUE ACEITA APENAS ELEMENTOS DO TIPO STRING
		Set<String> aprovados = new TreeSet<String>();
		aprovados.add("Vitor");
		aprovados.add("Pedro");
		aprovados.add("João");
		aprovados.add("Lucas");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
	}
	
}