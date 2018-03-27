package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// TIPOS BOLEANO
		boolean bo1 = true;
		boolean bo2 = false;
		System.out.printf("%b %b\n", bo1, bo2);
		
		// TIPOS CARACTER
		char c1 = 'A';
		char c2 = '!';
		char c3 = '\u0050';// Valor Unicode Da Letra 'P'
		System.out.printf("%c %c %c", c1, c2, c3);
		
		// TIPOS INTEIROS
		byte i1 = 127; // LIMITE - De '-128' a '127'
		short i2 = 32_767;
		int i3 = 2_147_483_647;
		//TODO NUMERO SOLTO NO JAVA, POR PADRÃO, É CONSIDERADO UM INTEIRO
		//ENTÃO PARA QUE HAJA UMA DIFERENCIAÇÃO ENTRE INTEIROS E LONGS O ACONSELHADO É COLOCAR UM 'L' NO FINAL DO NUMERO DO TIPO 'long'
		long i4 = 9_223_372_036_854_775_807L;
		System.out.printf("\n%d %d %d %d\n", i1, i2, i3, i4);
		
		// TIPOS REAIS (Ponto Flutuante)
		float r1 = 3.1416f;
		double r2 = 2.45;
		System.out.printf("%f %f \n", r1, r2);
		
		// toBinaryString - Serve Basicamente Para Escrever Um Numero Em Código Binário
		System.out.println(Integer.toBinaryString(i1));
		System.out.println(Integer.toBinaryString(i2));
		System.out.println(Integer.toBinaryString(i3));
		
		
	}
	
}
