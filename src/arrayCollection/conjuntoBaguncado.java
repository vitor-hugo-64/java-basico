package arrayCollection;

import java.util.HashSet;
import java.util.Set;

public class conjuntoBaguncado {
	
	public static void main(String[] args) {
		
		Set conjunto = new HashSet();
		
		//ADICIONAR ELEMENTOS AO SET
		conjunto.add("a");
		conjunto.add("Olá");
		conjunto.add(1);
		conjunto.add(45);
		conjunto.add(1.45);
		conjunto.add(false);
		
		System.out.println("Add...");
		// O SET NÃO ACEITA REPETIÇÕES E O NÚMERO 19 JÁ FOI UNCLUÍDO NO SET - ENTÃO A TELA PRINTARÁ FALSE POR O NUEMRO NÃO FOI INCLUÍDO
		System.out.println(conjunto.add(45));
		// O NÚMERO 9 AINDA NÃO FOI INCLUÍDO - ENTÃO A TELA PRINTARÁ TRUE, POIS O NUMERO FOI INCLUÍDO
		System.out.println(conjunto.add(9));
		
		System.out.println("");
		
		// REMOVER ELEMENTOS DO SET
		System.out.println("Remove...");
		// COMO O NUMERO 456 NÃO ESTÁ PRESENTE NO SET A TELA PRINTARÁ FALSE, INDICANDO QUE O NÚMERO NÃO FOI REMOVIDO
		System.out.println(conjunto.remove(456));
		// COMO O NUMERO 1.45 ESTÁ PRESENTE NO SET A TELA PRINTARÁ TRUE, POIS O NUMERO FOI REMOVIDO
		System.out.println(conjunto.remove(1.45 ));
		
		System.out.println("");
		
		System.out.println("Size...");
		// VERIFICA O NUMERO DE COMPONENTES DO SET
		System.out.println(conjunto.size());
		
		Set num = new HashSet();
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println("");
		
		//VERIFICA O QUE HÁ DE COMUM ENTRE DOIS SETS
		System.out.println(conjunto.retainAll(num));
		System.out.println(conjunto.size());
		
		System.out.println("");
		
		// LIMPA UM SET
		num.clear();
		
		// VERIFICA SE ESTÁ VAZIO
		System.out.println("Está Vazio...");
		System.out.println(num.isEmpty());
		
		
	}
	
}
