package orientacaoObjetos;

public class Produto {
	
	String nome;
	double preco;
	// static - ALGO STATICO É ALGO QUE É VÁLIDO PRA TODOS OS OBJETOS INSTANCIADOS DE DETERMINADA CLASSE
	// NESSE CASO SE O ATRIBUTO DESCONTO É STATICO TODOS OS OBJETOS INSTANCIADOS DESSA CLASSE TERÃO O MESMO VALOR
	static double desconto;
	
	Produto(){
		
	}
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	double precoComDesconto() {
		return preco - (preco*desconto);
	}
	
}
