package fundamentos;

public class OperadoresLogicos {

	
	public static void main(String[] args) {
		
		//OPERADOR BINÁRIO LÓGICO 'E'
		boolean temDinheiro1 = true;
		boolean temDinheiro2 = false;
		
		boolean comprarSorvete = temDinheiro1 || temDinheiro2;
		
		System.out.println(comprarSorvete);
		
		//OPERADOR BINÁRIO LÓGICO 'OU'
		boolean passouTeorica = true;
		boolean passouPratica = false;
		
		boolean temAbilitacao = passouTeorica && passouPratica;
		
		//OPERADOR BINÁRIO LÓGICO 'OU EXCLUSIVO'
		System.out.println(temAbilitacao);
		
		
		
	}
	
}
