package fundamentos;

public class If {

	public static void main(String[] args) {

		
		int idade1 = 16;
		// QUANDO EXISTE APENAS UMA SENTENÇA NÃO É OBRIGATÓRIO O USO DE CHAVES
		if (idade1 >= 16)
			System.out.println("Já Pode Fazer Titulo Se Quiser");

		
		int idade = 19;
		// QUANDO EXISTE MAIS DE UMA SENTENÇA NÃO PODE SER SEM CHAVES
		if (idade >= 18) {

			System.out.print("Maior De Idade - ");
			System.out.println("Já Pode Fazer A Carteira!");

		}

		
		float notaFinal = 8.5f;
		// EXEMPLO DE CÓDIGO COM 'ELSE' ONDE NÃO É OBRIGATÓRIO O USO DE CHAVES
		if (notaFinal >= 6)
			System.out.println("Aprovado!");
		else
			System.out.println("Reprovado!");

	}

}
