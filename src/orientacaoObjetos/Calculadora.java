package orientacaoObjetos;

public class Calculadora {
	
	double resultado;
	
	// METODO QUE RECEBE PARAMETROS E RETORNA ALGO
	double somar(double a, double b) {
		resultado = a+b;
		return resultado;
	}
	
	//METODO QUE RECEBE PARAMETROS MAS NÃO RETORNA NADA
	void adicionar(double a) {
		resultado += a;
	}
	
	//METODO QUE NÃO RECEBE PARAMETROS MAS RETORNA ALGO
	double retornarResultado() {
		return resultado;
	}
	
	//METODO QUE NÃO RECEBE PARAMETROS E NEM RETORNA NADA
	void limpar() {
		resultado = 0;
	}
	
}
