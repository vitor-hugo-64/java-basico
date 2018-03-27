package orientacaoObjetos;

public class DataTeste {
	
	public static void main(String[] args) {
		
		//CHAMA CONSTRUTOR SEM PARAMETROS
		Data nascimento = new Data();
		nascimento.dia = 30;
		nascimento.mes = 05;
		nascimento.ano = 1998;
		
		//CHAMA CONSTRUTOR COM PARAMETROS
		Data alistamentoQuartel = new Data(05,07,2016);
		System.out.println(nascimento.formatarData());
		System.out.println(alistamentoQuartel.formatarData());
		
	}
	
}
