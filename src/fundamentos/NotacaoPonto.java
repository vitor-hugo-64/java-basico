package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		/*
		 * NESSE CASO O PONTO ESTÁ SERVINDO PARA CHAMAR UM METODO DO OBJETO STRING
		 * replace - Serve Para Substituir Uma Palavra Por Outra
		 * toUpperCase - Serve Para Deixar Todas As Letras Da String Maiúsculas
		 * concat - Serve Pra Concatenar O Conteúdo Da String Com Uma Nova Palavra Definida Dentro Do Parenteses7
		 * É IMPORTANTE RESSALTAR QUE UM METODO APONTA PARA O RESULTADO QUE O METODO ANTERIOR IRÁ RETORNAR
		 */
		String palavra = "Boa Dia".replace("Boa", "Bom").toUpperCase().concat("!");
		System.out.print(palavra);
		
	}
	
}
