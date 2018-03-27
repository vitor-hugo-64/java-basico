package fundamentos;

public class Conversoes {
	
	public static void main(String[] args) {
		
		// Todo Valor Real Declarado Dentro De Uma Variável Por Padrão É Considerado Um Double.
		// A Capacidade De Armazenamento De Um Double É Maior DE Que Um Float.
		// Então Nesse Caso Ele É Convertido Para Poder Ser Considerado Um FLOAT E Ser Evitado A Perda De Dados.
		float f2 = (float) 0.1;
		System.out.println(f2);
		
		// O Tipo Primitivo Inteiro Não Aceita Números Com Casas Decimais
		// Então Nesse Caso Ele É Convertido Para Que Haja Uma Truncagem Das Casas Decimais
		int i2 = (int) 7.9;
		System.out.println(i2);
		
		// Todo Caracter Tem Um Valor Inteiro Correspondente Então Esse É Um Exemplo De Conversão Implicita(automática)
		int i3 = 'Q';
		System.out.println(i3);
		
		// 1001 É Um Numero Inteiro Mas Como Ele Não Ultrapassa A Capacidade De Armazenamento De Um Double
		// É Feita Uma Conversão Implicita(automática).
		double d1 = 1001;
		System.out.println(d1);
		
	}

}
