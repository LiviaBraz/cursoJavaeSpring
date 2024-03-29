package seção10.generic;

public class GenericMain {

	public static void main(String[] args) {
		
		GenericExample<Integer> mensagemInteira = new GenericExample<>(1000);
		mensagemInteira.escrever();
		
		GenericExample<Double> mensagemDecimal = new GenericExample<>(888.24);
		mensagemDecimal.escrever();
		
		GenericExample<String> mensagemString = new GenericExample<>("Mensagem em texto");
		mensagemString.escrever();
	}

}
