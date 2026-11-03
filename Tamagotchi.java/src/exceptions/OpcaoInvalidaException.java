package exceptions;

@SuppressWarnings("serial")
public class OpcaoInvalidaException extends Exception {
	public OpcaoInvalidaException(String mensagem) {
		super(mensagem);
	}
}
