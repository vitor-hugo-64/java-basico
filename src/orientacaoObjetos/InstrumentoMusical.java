package orientacaoObjetos;

public class InstrumentoMusical {
	
	String nome;
	String marca;
	double valor;
	double desconto;
	
	InstrumentoMusical(){
		
		// ESSE THIS É REFERENTE AO METODO CONSTRUTOR - NESSE CASO O THIS QUE ESTÁ DENTRO DESSE METODO CONSTRUTOR SEM PARAMETROS CHAMA O OUTRO METODO COM PARAMETROS E ATRIBUI A ELE VALORES PADRÃO 
		this("Violão", "Tagima", 1.200, 0.5);
		
	}
	
	InstrumentoMusical(String nome, String marca, double valor, double desconto){
		
		// ESSE THIS É REFERENTE AO OBJETO ATUAL EM QUE ESTÁ SENDO FEITO A CHAMADA
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.desconto = desconto;
		
	}

}
