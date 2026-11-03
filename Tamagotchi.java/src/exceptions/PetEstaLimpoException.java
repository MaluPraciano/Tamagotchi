package exceptions;

@SuppressWarnings("serial")
public class PetEstaLimpoException extends Exception {
	public PetEstaLimpoException(String mensagem) {
		super(mensagem);
	}
}
