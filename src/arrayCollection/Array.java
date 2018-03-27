package arrayCollection;

public class Array {
	
	public static void main(String[] args) {
		
		// 1ª FORMA DE CRIAR UM ARRAY - DEFININDO OS VALORES DE IMEDIATO
		double[] vetor = {1,2,4,3,8};
		
		// 2ª FORMA DE SE CRIAR UM ARRAY - DEFININDO O NUMERO DE INDICES QUE ESSE ARRAY PODERÁ TER
		double[] vetor2 = new double[5];
		
		vetor2[0] = 1.5;
		vetor2[1] = 2.3;
		vetor2[2] = 4.9;
		vetor2[3] = 6.4;
		vetor2[4] = 7.6;
		
		double[] notas = {5,9,8};
		
		double totalNotas = 0;
		
		// ESTRUTURA CONHECIDA COMO FOR(each) QUE É O MAIS ACONSELHADO A SE USAR QUANDO SE PERCORRE UM ARRAY
		// A PRIMEIRA VARIAVEL DO TIPO DOUBLE É A QUE, EM CADA VOLTA, VAI RECEBER OS VALORES DO ARRAY QUE SERÁ PERCORRIDO
		// DEPOIS DOS ':' SE COLOCA O NOME DO ARRAY QUE SERÁ PERCORRIDO
		for(double nota: notas) {
			totalNotas += nota;
		}
		
		System.out.println(totalNotas/notas.length);
		
		double total1 = 0;
		double total2 = 0;
		
		// O LENGTH SERVE PARA LER O NUMERO DE CASAS DE UMA STRING OU O NUMERO DE INDICES DE UM ARRAY
		// NESSE CASO ELE ESTÁ DIZENDO QUE O 'for' TERÁ QUE SER EXECUTADO ATÉ O NUMERO DE 'I' SER MENOR QUE O NUMERO DE INDICES DO ARRAY 'vetor' 
		for(int i = 0; i < vetor.length; i++) {
			total1 += vetor[i];
		}
		
		for(int x = 0; x < vetor2.length; x++) {
			total2 += vetor2[x];
		}
		
		System.out.println(total1);
		System.out.println(total2 / vetor.length);
		
	}
	
}
