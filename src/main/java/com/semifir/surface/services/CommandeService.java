package com.semifir.surface.services;

import java.util.List;

import com.semifir.surface.models.Commande;

public interface CommandeService {

	List<Commande> findAll();

	Commande findOne(Long id);

	Commande update(Commande commande);

	Commande create(Commande commande);

	void delete(Long id);

}
