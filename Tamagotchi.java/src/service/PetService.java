package service;

import model.Pet;
import repository.PetRepository;
import exceptions.PetNaoEncontradoException;

public class PetService {
	private PetRepository petRepository;
	
	public PetService(PetRepository petRepository) {
		this.petRepository = petRepository;
	}
	public void alimentar() throws PetNaoEncontradoException {
		Pet pet = petRepository.find();
		if (pet == null) {
			throw new PetNaoEncontradoException("Crie um pet primeiro!");
		}
		pet.alimentar();
		pet.passarTurno();
	}
}
