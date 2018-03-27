package oo.polimorfismo;

public class Pessoa {

	private double peso;

	public Pessoa(double peso) {

		this.peso = peso;

	}
	
	public double getPeso() {
		return this.peso;
	}
	
	// NESSE CASO SE COLOCA UMA VARIÁVEL DO TIPO COMIDA PARA QUE TODA CLASSE(COMIDA) QUE HERDE DE  DA CLASSE PAI 'COMIDA' POSSA SER USADA NESSE METODO
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

}
