package arrayCollection;


import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		// DECLARACAO DE UMA LIST, O LIST RESPEITA A ORDEM DE INSERÇÃO DOS DADOS
		// É INDEXADO, ENTÃO PODE SE OBTER OS VALORES ATRAVES DE INDICES(Como o Array)
		List<String> alunos = new ArrayList<String>();
		alunos.add("Vitor");
		alunos.add("João");
		alunos.add("Pedro");
		alunos.add("Vitor");
		
		// OBTENDO VALORES ATRAVÉS DE INDICE
		System.out.println("Get...");
		System.out.println(alunos.get(0));
		
		//REMOVENDO VALORES
		// NESSE CASO ELE SÓ REMOVERÁ UM DOS NOMES REPETIDOS(O ULTIMO) E O OUTRO CONTINUARA NA LISTA
		alunos.remove("Vitor");
		
		
	}
	
}
