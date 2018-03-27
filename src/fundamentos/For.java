package fundamentos;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		// SERVE PRA CAPTURAR DADOS INFORMADOS PELO USUARIO ATRAVÉ DO CONSOLE
		Scanner scanner = new Scanner(System.in);
		
		double somaNotas = 0;
		double nota = 0;
		
		// EXEMPLO DE 'FOR'
		for (int indice = 0; indice < 3; indice++) {
			
			// nextDouble - Serve Pra Capturar Os Valores Conforme A Estrutura de Repetição Faz O Loop
			nota = scanner.nextDouble();
			somaNotas += nota;
			
		}
		
		scanner.close();
		System.out.println(somaNotas/3);

	}

}
