package fundamentos;

import java.util.Scanner;
//
public class Switch {

	public static void main(String[] args) {
		
		Scanner informacao = new Scanner(System.in);
		int  nota = informacao.nextInt();
		
		switch(nota) {
		
		case 1:
			System.out.println("O Numero Digitado Foi 1");
			break;
		
		case 2:
			System.out.println("O Número Digitado Foi 2");
			break;
			
		case 3:
			System.out.println("O Número Digitado Foi 3");
			break;
		
		default:
			System.out.println("Nenhuma Das Anteriores!");
		
		}
		
		
	}
	
}
