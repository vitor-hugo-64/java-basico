package api;

public class explorandoString {

	public static void main(String[] args) {

		String nome = new String("Leonardo");
		nome = "Leo" + "nardo";

		// MÉTODOS

		// COLOCA TUDO EM MAIUSCULO
		System.out.println(nome.toUpperCase());

		// RETORNA O NUMERO DE CARACTERES QUE A STRING TEM
		System.out.println(nome.length());

		// PEGA UMA DETERMINADA PARTE DA STRING, INFORMANDO NO PARANTESES O INTERVALO
		// QUE SE DESEJA PEGAR
		System.out.println(nome.substring(0, 3));

		// RETORNA O PRIMEIRO INDICE EM QUE DETERMINADO CARACTER SE ENCONTRA
		System.out.println(nome.indexOf("d"));

		// RETORNA A LETRA QUE SE ENCONTRA EM DETERMINADA POSICAO INFORMADA DENTRO DO PARANTESES
		System.out.println(nome.charAt(6));
		
		// FAZ UMA COMPARAÇÃO ENTRE DUAS STRING SEM LEVAR EM CONSIDERAÇÃO AS LETRAS MAIUSCULAS
		System.out.println(nome.equalsIgnoreCase("leonardo"));
		
		// VERIFICA SE DETERMINADO TRECHO INFORMADO BATE COM O COMEO DA STRING
		System.out.println(nome.startsWith("Leo"));
		
		// VEIRIFICA SE A STRING ESTÁ VAZIA
		System.out.println(nome.isEmpty());
		
		// CONCATENA DUAS OU MAIS STRINGS
		System.out.println(nome.concat(" é Legal").concat("!"));

	}

}
