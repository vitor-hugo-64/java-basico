package oo.polimorfismo;

public class Comida {

	private double peso;
	
	public void setPeso(double peso) {
		if(peso < 0) {
			this.peso = 0;
		}else {
			this.peso = peso;
		}
	}
	
	public double getPeso() {
		return this.peso;
	}
	
}
