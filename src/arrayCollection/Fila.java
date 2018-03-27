package arrayCollection;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		// LÓGICA POR TRÁS DA FILA - O PRIMEIRO QUE CHEGA É O PRIMEIRO QUE É ATENDIDO
		Queue<String> fila = new LinkedList<>();
		
		// O OFFER FAZ A MESMA COISA QUE O ADD, MAS O OFFER SE SE NÃO ADICIONAR UM  DETERMINADO VALOR POR CAUSA DE ALGUMA TIPO DE RESTRIÇÃO ELE IRÁ RETORNAR FALSE
		// JÁ O ADD IRÁ RETORNAR UM ERRO
		
		fila.offer("Vitor Hugo");
		fila.offer("Lucas");
		fila.offer("Pedro");
		fila.offer("Tiago");
		fila.add("Brenda");
		
		// O PEEK E O ELEMENT FAZEM A MESMA COISA, QUE É CONSULTAR QUAL É O PRIMEIRO DA FILA
		System.out.println("Peek / Element...");
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		// O POOL E O REMOVE FAZEM A MESMA COISA, QUE É CONSULTAR E REMOVER O PRIMEIRO DA FILA
		// A DIFERENÇA ENTRE UM E OUTRO É QUE O POOL RETORNA FALSO CASO NÃO DE PRA REMOVER, O REMOVE RETORNA UM ERRO
		System.out.println("Poll / Remove...");
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
		
		
	}
	
}
