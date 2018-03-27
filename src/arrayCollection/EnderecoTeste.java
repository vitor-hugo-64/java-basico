package arrayCollection;

public class EnderecoTeste {

	public static void main(String[] args) {
		
		Endereco end1 = new Endereco("Rua Orsi", 238, "Sala 101");
		Endereco end2 = new Endereco("Rua Orsi", 238, "Sala 101");
		
		// NESSE CASO ELE RETORNARA FALSO POIS O QUE ESTÁ SENDO COMPARADO É O ENDERECO NA MEMORIA EM QUE ESTÁ ARMAZENADO DETERMINADO OBJETO
		System.out.println(end1 == end2);
		
		// NESSE CASO ELE RETORNARÁ TRUE POIS O QUE ESTÁ SENDO COMPARADO É OS VALORES DO OBJETO
		System.out.println(end1.equals(end2));
		
	}
	
}
