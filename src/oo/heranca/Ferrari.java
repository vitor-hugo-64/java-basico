package oo.heranca;

public class Ferrari extends Carro {
	
	// COMO ELE TA HERDANDO A MESMA VELOCIDADE DA CLASSE PAI ENTÃO É FEITO UM OUTRO CONSTRUTOR PARA SE PODER MUDAR A VELOCIDADE MAXIMA
	public Ferrari() {
		VELOCIDADE_MAXIMA = 350;
	}
	
	// AQUI É MUDADO A MANEIRA DE ACELERAR
	public void acelerar() {
		super.acelerarMais(20);
	}
	
}
