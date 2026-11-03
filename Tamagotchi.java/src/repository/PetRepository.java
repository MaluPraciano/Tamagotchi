package repository;

import java.util.ArrayList;
import java.util.List;

import model.Pet;

public class PetRepository {
	
	List<Pet> pets = new ArrayList<Pet>();

	public Pet find() {
		return pets.get(0);
	}
	
	public void findAll() {}
	
	public void create(String nome, String especie) {
		Pet pet = new Pet(nome, especie);
		pets.add(pet);
	}
	public void update() {}
	public void delete() {}
	
}
