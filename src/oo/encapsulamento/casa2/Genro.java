package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {

	private String segredo = "Minha Sogra Fala Demais";
	
	public static void main(String[] ags) {
		
		Genro euMesmo = new Genro();
		System.out.println("Nunca Falarei "+euMesmo.segredo);
		
		Filha namorada = new Filha();
		System.out.println(namorada.segredoDeCasal);
		
		Sogro sograo = new Sogro();
		System.out.println(sograo.gostaDeCerveja);
		
		// ESTÁ INFORMAÇAO NÃO PODE SER ACESSADA POIS É PROTEGIDO
		//Sogra sogrinha = new Sogra();
		//System.out.println(sogrinha.segredoDeFamilia);
		
	}
	
}
