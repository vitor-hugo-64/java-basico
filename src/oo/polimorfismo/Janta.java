package oo.polimorfismo;

public class Janta {

	public static void main(String[] args) {

		Arroz arroz = new Arroz();
		arroz.setPeso(0.785);

		Feijao feijao = new Feijao();
		feijao.setPeso(0.945);
		
		Sorvete sorvete = new Sorvete();
		sorvete.setPeso(0.452);

		Pessoa Vitor = new Pessoa(85);
		Vitor.comer(arroz);
		Vitor.comer(feijao);
		
		System.out.println(Vitor.getPeso());
		
		
	}

}
