package arrayCollection;

import java.util.Stack;

public class pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<>();
		
		pilha.push("Livro 1");
		pilha.push("Livro 2");
		pilha.push("Livro 3");
		
		// METODO PRA VERIFICAR QUAL É O ULTIMO LIVRO COLOCADO NA PILHA
		System.out.println("Peek...");
		System.out.println(pilha.peek());
		
		System.out.println("");
		
		// METODO PRA VERIFICAR E TIRAR O ULTIMO LIVRO DA PILHA
		System.out.println("Pop...");
		System.out.println(pilha.pop());
		
	}
	
}
