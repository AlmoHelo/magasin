package com.semifir.surface.services;

import java.util.List;

import com.semifir.surface.models.Client;
import com.semifir.surface.repositories.ClientRepository;

public class ClientServiceImpl implements ClientService{

	private ClientRepository clientRepository;
	
	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
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

}
