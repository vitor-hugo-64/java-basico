package fundamentos;

// Importa O JOptionPAne
import javax.swing.JOptionPane;

public class ConversaoString {
	
	public static void main(String[] args) {
		
		// JOptionPane - Serve Para Abrir Uma Caixa De Texto
		String num = JOptionPane.showInputDialog("Informe Um Numero: ");

		String num2 = JOptionPane.showInputDialog("Informe Um Divisor: ");
		
		// NESSE CASO ELE NÃO SOMARIA AS DUAS VARIÁVEIS, HAVERIA UMA CONCATENAÇÃO, POIS AS DUAS SÃO DO TIPO CARACTER
		// PARA SE FAZER UMA OPERAÇÃO MATEMATICA O CERTO É SE CONVERTER ESSES VALOR DE STRING PARA DOUBLE, FLOAT, INTEGER E ETC.
		System.out.println("Numeros Concatenados: "+num + num2);
		
		// CONVERTE UM VALOR STRING EM DOUBLE
		double numero = Double.parseDouble(num);
		double numero2 = Double.parseDouble(num2);
		
		double resultado = numero+numero2;
		System.out.println("Resultado De Uma Operação Matematica: "+resultado);
		
		
		// DESSA FORMA SE CONVERTE UM NUMERO INTEIRO EM STRING
		// Nesse caso se pode usar o metodo de conversao 'toString' porque foi criado uma objeto(wrapper) string
		Integer num1 = 10000;
		System.out.println(num1.toString());
		
		// Nesse caso foi criado uma variável do tipo primitivo 'int' entao se deve usar o metodo da classe 'Integer' para se fazer a conversao
		int num4 = 10000;
		System.out.println(Integer.toString(num4));
		// O metodo '.length' serve para retornar o numero de caracteres que tem uma determinada variável 
		System.out.println(Integer.toString(num4).length());
		
	}
	
}
