package orientacaoObjetos;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		// DESSA FORMA DE DEFINE ALGO STATICO PARA TODOS OS OBJETOS INSTANCIADOS DE DETERMINADA CLASSE
		Produto.desconto = 0.5;
		
		//DOIS OBJETOS INSTANCIADOS
		Produto produto1 = new Produto("Notebook Acer",2300);
				
		Produto produto2 = new Produto();
		produto2.nome = "Caneta Bic Preta";
		produto2.preco = 1.50;
		
		System.out.println(produto1.precoComDesconto());
		System.out.println(produto2.precoComDesconto());
		
	}
	
}
