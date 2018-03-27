package arrayCollection;

public class Matriz {

	public static void main(String[] args) {
		
		//MATRIZ QUE JÁ RECEBE OS VALORES
		int [][] numeros = {{1,2,5},{4,9,7}};
		
		double [][] numeros2 = new double[2][2];
		numeros2[0][0] = 3;
		numeros2[0][1] = 2;
		numeros2[1][0] = 4;
		numeros2[1][1] = 8;
		
		double nota = 0;
		double somaNota = 0;
		
		// MANEIRA DE PERCORRER UMA MATRIX USANDO O FOR
		for(int x = 0; x < numeros.length; x++) {
			for(int i = 0; i < numeros[x].length; i++) {
				nota = numeros[x][i];
				somaNota += nota;
			}
		}
		
		System.out.println(somaNota);
		somaNota = 0;
		
		//MANEIRA DE PERCORRER UMA MATRIX USANDO O FOR(each)
		for(double[] notaParcial: numeros2) {
			for(double notaParcial2: notaParcial) {
				somaNota += notaParcial2;
			}
		}
		
		System.out.println(somaNota);
		
		
	}
	
}
