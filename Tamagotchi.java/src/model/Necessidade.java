package model;

public abstract class Necessidade {
	private final String nome;
	private int valor;
	
	protected Necessidade(String nome, int valorInicial) {
		this.nome = nome;
		this.valor = valorInicial;
	}
	
	public abstract void passarTurno();
	
	public void aumentar(int qtd) { valor = Math.min(100, valor + qtd); }
	public void diminuir(int qtd) { valor = Math.max(0, valor - qtd); }
	
	public String getNome() {return nome;}
	public int getValor() {return valor;}
}
