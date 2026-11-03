package model;

import java.util.ArrayList;
import java.util.List;

public class Pet {
	String nome;
	String especie;
	private final Saciado saciado = new Saciado();
	private final Energia energia = new Energia();
	private final Higiene higiene = new Higiene();
	private final Felicidade felicidade = new Felicidade();
	private final List<Necessidade> necessidades = new ArrayList<>();
	
	public Pet(String nome, String especie) {
		super();
		this.nome = nome;
		this.especie = especie;
	}
	
	public String getNome() {
		return nome;
	}

	public String getEspecie() {
		return especie;
	}

	public int getSaciado() {
		return saciado.getValor();
	}

	public int getEnergia() {
		return energia.getValor();
	}

	public int getHigiene() {
		return higiene.getValor();
	}

	public int getFelicidade() {
		return felicidade.getValor();
	}

	public List<Necessidade> getNecessidades() {
		return necessidades;
	}
		

	@Override
	public String toString() {
		return "Pet [nome=" + nome + ", especie=" + especie + "]";
	}
	
	
	
	public void passarTurno() {
		for (Necessidade n: necessidades) {
			n.passarTurno(); 
		}
	}
	
	protected Pet(String nome) {
	this.nome = nome;
	
	necessidades.add(new Energia());
	necessidades.add(new Saciado());
	necessidades.add(new Felicidade());
	necessidades.add(new Higiene());
	 
	}
	
	public void alimentar() {
		saciado.aumentar(30);
		energia.diminuir(10);
		felicidade.aumentar(10);
		
	}
	
	public void brincar() {
		energia.diminuir(20);
		higiene.diminuir(20);
		saciado.diminuir(20);
		felicidade.aumentar(50);
	}
	
	public void dormir() {
		saciado.diminuir(30);
		energia.aumentar(40);
		higiene.diminuir(20);
	}
	
	public void darBanho() {
		higiene.aumentar(50);
		felicidade.aumentar(10);
		energia.aumentar(10);
	}
	
}

