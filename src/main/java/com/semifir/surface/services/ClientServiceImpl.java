package com.semifir.surface.services;

import java.util.List;

import com.semifir.surface.models.Client;
import com.semifir.surface.models.Commande;
import com.semifir.surface.repositories.ClientRepository;
import com.semifir.surface.repositories.CommandeRepository;

public class ClientServiceImpl implements ClientService{

	private ClientRepository clientRepository;
	private CommandeRepository commandeRepository;
	
	public ClientServiceImpl(ClientRepository clientRepository, CommandeRepository commandeRepository) {
		this.clientRepository = clientRepository;
		this.commandeRepository = commandeRepository;
	}
	
	@Override
	public List<Client> findAll() {
		return this.clientRepository.findAll();
	}

	@Override
	public Client findOne(Long id) {
		return this.clientRepository.findById(id).get();
	}

	@Override
	public Client create(Client client) {
		return this.clientRepository.save(client);
	}

	@Override
	public Client update(Client client) {
		return this.clientRepository.save(client);
	}

	@Override
	public void delete(Long id) {
		this.clientRepository.deleteById(id);
	}

	@Override
	public List<Commande> findCommandes(Long id) {
		
		return this.commandeRepository.findByClientId(id);
	}

}
