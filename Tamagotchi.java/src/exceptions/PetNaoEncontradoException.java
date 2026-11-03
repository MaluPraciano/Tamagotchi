package exceptions;

@SuppressWarnings("serial")
public class PetNaoEncontradoException extends Exception {
	public PetNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
}
