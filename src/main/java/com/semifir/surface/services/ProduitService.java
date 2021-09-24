package com.semifir.surface.services;

import java.util.List;

import com.semifir.surface.models.Produit;

public interface ProduitService {

	List<Produit> findAll();

	Produit findOne(Long id);

	Produit create(Produit produit);

	Produit update(Produit produit);

	void delete(Long id);

}
