package fundamentos;

public class Variaveis {
	
	public static void main(String[] args) {
		
		// MANEIRA DE DECLARAR UMA VARIÁVEL
		double raioCircunferencia = 4.5;
		
		//MANEIRA DE DECLARAR UMA CONSTANTE, SEMPRE COLOCANDO A PALAVRA 'final' NA FRENTE
		final double PI = 3.14;
		
		//ATRIBUINDO UMA CONTA À UMA VARIÁVEL
		double area = PI * (raioCircunferencia*raioCircunferencia);
		
		//PRINTA O RESULTADO NA TELA
		//Note Que O Sinal De '+' Serve Para Concatenar Uma Variável Com Uma String
		System.out.println("A Área É " + area);
		
		//PRINTA O RESULTADO NA TELA
		//O 'printf' Serve Para Decidir O Lugar Onde A Variável Vai Ser Mostrada Atravé do '%f'
		//O '\n' Serve Para Quebrar A Linha
		System.out.printf("A Área É %f metros Quadrados \n", area);
		
		//PRINTA O RESULTADO NA TELA
		//Pode Tambem Se Controlar O Numeros De Casas Decimais Que Irá Ser Mostrado A Partir Do '.2'
		System.out.printf("A Área É %.2f Metros Quadrados", area);
		
		
	}
	
}
