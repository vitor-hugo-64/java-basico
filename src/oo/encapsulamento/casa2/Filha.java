package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

// HERDA OS ATRIBUTOS DA MÃE
public class Filha extends Sogra {
	
	//COMO AQUI NÃO FOI DECLARADO SE É PUBLICO OU PRIVADO POR PADRÃO ELE FICA COMO DEFAULT
	String segredoDeCasal = "Meu Marido Está Quase Sendo Demitido";
	
	public static void main(String[] args) {
		
		Filha euMesma = new Filha();
		System.out.println("Meus Pais Não Sabem"+euMesma.segredoDeCasal);
		
		Sogro pai = new Sogro();
		System.out.println(pai.gostaDeCerveja);
		
		// ESSE ATRIBUTO É PROTEGIDO ENTÃO NÃO SE PODE ACESSAR DESSE JEITO, MAS COMO ELE É HERDADO DA PRA SE ACESSAR DO GEITO ABAIXO
		// Sogra mamae = new Sogra();
		// System.out.println(mamae.segredoDeFamilia);
		
		System.out.println(euMesma.segredoDeFamilia);
		
		// NESSE CASO ELE NÃO CONSEGUIRIA ACESSAR O ATRIBUTO PORQUE É PRIVADO
		// Genro namorado = new Genro();
		// System.out.println(namorado.segredo);
		
	}
	
}
