package model;

public class Higiene extends Necessidade {
	
	public Higiene() {
		super("Higiene", 100);
	}
	
	@Override
	public void passarTurno() {
		diminuir(5);
	}
}