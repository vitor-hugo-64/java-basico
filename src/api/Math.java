package api;

public class Math {

	private static final char[] PI = null;

	public static void main(String[] args) {
		
		//  A CLASSE MATH É UMA CLASSE QUE POSSUI METODOS ESTATICOS
		// OU SEJA NÃO SE TEM NECESSIDADE DE INSTANCIAR ELA PARA PODER USAR SEU METODOS
		
		// NUMERO DE PI
		System.out.println(Math.PI);
		
		// ELEVAR A POTENCIA, O SEGUNDO NUMERO É A POTENCIA
		System.out.println(Math.pow(2, 3));
		
		// RETORNA VALOR ABSOLUTO
		System.out.println(Math.abs(-10.5));
		
		// PEGA DOIS VALORES E RETORNA O MINIMO
		System.out.println(Math.min(70, 7));
		
		// PEGA DOIS NUMEROS E RETORNA O MAIOR
		System.out.println(Math.max(70, 7));
		
		// ARREDONDA NUMEROS PRA CIMA
		System.out.println(Math.ceil(6.55));
		
		// ARREDONDA PRA BAIXO
		System.out.println(Math.floor(6.55));
		
		// GERA VALORES ALEATORIOS ENTRE 0 E 1
		System.out.println(Math.random());
		
	}
	
}
