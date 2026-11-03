package model;

public class Felicidade extends Necessidade{
	public Felicidade() {
		super("Felicidade", 100);
	}
	
	public void passarTurno() {
		diminuir(5);
	}
}
