package com.semifir.surface.services;

import java.util.List;

import com.semifir.surface.models.Client;
import com.semifir.surface.models.Commande;

public interface ClientService {

	List<Client> findAll();

	Client findOne(Long id);

	Client create(Client client);

	Client update(Client client);

	void delete(Long id);

	List<Commande> findCommandes(Long id);

}
