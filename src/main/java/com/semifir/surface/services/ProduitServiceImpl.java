package com.semifir.surface.services;

import java.util.List;

import com.semifir.surface.models.Produit;
import com.semifir.surface.repositories.ProduitRepository;

public class ProduitServiceImpl implements ProduitService{

	private ProduitRepository produitRepository;

	public ProduitServiceImpl(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}
	@Override
	public List<Produit> findAll() {
		return this.produitRepository.findAll();
	}

	@Override
	public Produit findOne(Long id) {
		return this.produitRepository.findById(id).get();
	}

	@Override
	public Produit create(Produit produit) {
		return this.produitRepository.save(produit);
	}

	@Override
	public Produit update(Produit produit) {
		return this.produitRepository.save(produit);
	}

	@Override
	public void delete(Long id) {
		this.produitRepository.deleteById(id);
	}

}
