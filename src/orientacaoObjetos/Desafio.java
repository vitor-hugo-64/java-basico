package orientacaoObjetos;

public class Desafio {
	
	int a = 2;
	
	public static void main(String[] args) {
		
		//PARA ACESSAR UMA VARIÁVEL DE INSTANCIA DENTRO DE UM METODO QUE PERTENCE A UMA CLASSE(static)
		// É NECESSÁRIO PRIMEIRO CRIAR UMA INSTANCIA DE DETERMINADA CLASSE PRA DEPOIS ACESSAR A VARIÁVEL
		Desafio d = new Desafio();
		System.out.println(d.a);
		
	}

}
