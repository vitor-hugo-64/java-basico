package arrayCollection;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> aprovados = new HashMap<>();
		
		aprovados.put(1, "Vitor Hugo");
		aprovados.put(2, "Lucas");
		aprovados.put(3, "Tiago");
		aprovados.put(4, "Pedro");
		
		// O MAP AO INVES DE PROIBIR A ENTRADA DE PARAMETROS IGUAIS ELE SUBSTITUI
		aprovados.put(4, "Brenda");
		
		
		// PEGA O VALOR DA CHAVES DO MAP
		System.out.println("keySet...");
		System.out.println(aprovados.keySet());
		// PEGA O VALOR DOS CONTEUDOS DO MAP
		System.out.println("");
		System.out.println("Values...");
		System.out.println(aprovados.values());
		// PEGA OS DOIS
		System.out.println("");
		System.out.println("entrySet...");
		System.out.println(aprovados.entrySet());
		
		// PEGAR O VALOR DO CONTEUDO ATRAVÉS DA CHAVE
		System.out.println("");
		System.out.println("Get...");
		System.out.println(aprovados.get(3));
		
		System.out.println("");
		
		// PERCORRER O MAP E PEGAR OS VALORES DA CHAVES
		System.out.println("Chaves...");
		for(Integer chave: aprovados.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("");
		System.out.println("Nomes...");
		for(String nome: aprovados.values()) {
			System.out.println(nome);
		}
		
	}
	
}
