package orientacaoObjetos;

public class Data {

	int dia;
	int mes;
	int ano;
	
	// NÃO SE PODE CRIAR DOIS METODOS CONSTRUTORES QUE TENHAM OS MESMO PARAMETROS
	
	//METODO CONTRUTOR QUE NÃO RECEBE PARAMETRO NENHUM
	Data(){
		
	}
	
	//METODO CONSTRUTOR QUE RECEBE PARAMETROS
	Data(int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	
	String formatarData() {
		return(this.dia+" / "+this.mes+" / "+this.ano);
	}
	
}
