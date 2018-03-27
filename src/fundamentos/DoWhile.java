package fundamentos;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		int nota = 0;
		Scanner informacao = new Scanner(System.in);
		
		do {
			
			nota = informacao.nextInt();
			
		}while(nota == -1);
		
	}
	
}
