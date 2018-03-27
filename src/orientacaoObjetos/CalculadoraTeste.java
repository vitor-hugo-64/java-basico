package orientacaoObjetos;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		
		System.out.println(calc.somar(4, 5));
		
		calc.adicionar(7);
		
		System.out.println(calc.retornarResultado());
		
		calc.limpar();
		
		System.out.println(calc.retornarResultado());
		
	}
	
}
