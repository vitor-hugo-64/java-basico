package fundamentos;

public class objetosWrapper {
	
	public static void main(String[] args) {
		
		/*
		 * OS OBJETOS WRAPPER SE DIFERENCIAM DE TIPOS PRIMITIVOS, POIS OS TIPOS PRIMITIVOS
		 * SÃO DECLARADOS COM LETRA MINUSCULA. 
		 * EXEMPLO DE TIPOS PRIMITIVOS: boolean, int E ETC.
		 * EXEMPLO DE WRAPPERS: Boolean, Int, Character E ETC.
		 * 
		 * A DIFERENCA ENTRE OS DOIS É QUE COM OS WRAPPERS SE CONSEGUE USAR OS METODOS PERTENCENTES AQUELA CLASSE
		 * JÁ QUE OS WRAPPERS SÃO OBJETOS. EX: C1.replace("Q","q")
		 */
		
		//EXEMPLO DE WRAPPER
		Character c1 = 'Q';
		Boolean b1 = true;
		Byte b2 = 1;
		Short s1 = 2;
		Integer i1 = 5;
		Long l1 = 4L;
		Float f1 = 2.5f;
		Double d = 3.5;
		
		// OUTRO EXEMPLO DE METODO QUE PODE SER USADO COM UM WRAPPER E QUE COM TIPOS PRIMITIVOS NÃO SERIA POSSÍVEL
		System.out.println(b1.toString());
		
		
		
	}
	
}
