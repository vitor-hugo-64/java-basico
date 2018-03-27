package orientacaoObjetos;

public class ValorVsReferencia {
	
	static void porValor(double numero) {
		numero++;
	}
	
	static void porReferencia(Produto produto) {
		produto.preco++;
	}
	
	public static void main(String[] args) {
		
		double numero = 1;
		Produto caneta = new Produto("Caneta Bic Preta",1.50);
		
		// QUANDO É FEITO UMA PASSAGEM POR VALOR, A VARIÁVEL FAZ UMA CÓPIA DA VARIÁVEL ORIGINAL. ENTÃO MESMO QUE AQUELE METODO SEJA EXECUTADO O VALOR DA VARIÁVEL ORIGINAL NÃO SERÁ ALTERADO
		// QUANDO É FEITO UMA PASSAGEM DE VALOR POR REFERENCIA, O QUE NA VERDADE ESTÁ SENDO ATRIBUÍDO É O ENDEREÇO EM QUE DETERMINADO OBJETO ESTÁ ARMAZENADO. ENTÃO NO CASO DO OBJETO CANETA O METODO VAI ALTERAR O VALOR ORIGINAL POIS O METODO VAI PUXAR O ENDERECO EM QUE O OBJETO ESTÁ ARMAZENADO.
		porValor(numero);
		porReferencia(caneta);
		
		System.out.println(numero);
		System.out.print(caneta.preco);
		
	}
	
}
