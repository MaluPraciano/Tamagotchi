package model;

public class Saciado extends Necessidade {

	public Saciado() {
		super("Saciado", 100);
	}

	@Override
	public void passarTurno() {
		diminuir(5);
	}
}