package oo.heranca;

public class TesteDrive {

	public static void main(String[] args) {
		
		Carro c = new Civic();
		c.acelerar();
		System.out.println(c.getVelocidadeAtual());
		c.acelerar();
		System.out.println(c.getVelocidadeAtual());
		
		Carro f = new Ferrari();
		f.acelerar();
		System.out.println(f.getVelocidadeAtual());
		f.acelerar();
		f.acelerar();
		System.out.println(f.getVelocidadeAtual());
		f.frear();
		System.out.println(f.getVelocidadeAtual());
		
	}
	
}
