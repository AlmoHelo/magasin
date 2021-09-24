package com.semifir.surface.services;

import java.util.List;

import com.semifir.surface.models.Commande;
import com.semifir.surface.repositories.CommandeRepository;

public class CommandeServiceImpl implements CommandeService{
	
	private CommandeRepository commandeRepository;

	public CommandeServiceImpl(CommandeRepository commandeRepository) {
		this.commandeRepository = commandeRepository;
	}
	@Override
	public List<Commande> findAll() {
		return this.commandeRepository.findAll();
	}

	@Override
	public Commande findOne(Long id) {
		return this.commandeRepository.findById(id).get();
	}

	@Override
	public Commande update(Commande commande) {
		return this.commandeRepository.save(commande);
	}

	@Override
	public Commande create(Commande commande) {
		return this.commandeRepository.save(commande);
	}

	@Override
	public void delete(Long id) {
		this.commandeRepository.deleteById(id);
	}

}
