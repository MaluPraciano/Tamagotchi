package model;

public class Energia extends Necessidade {
	public Energia() {
		super("Energia", 100);
	}
	
	public void passarTurno() {
		diminuir(5);
	}
}
