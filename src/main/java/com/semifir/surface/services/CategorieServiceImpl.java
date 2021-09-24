package com.semifir.surface.services;

import java.util.List;

import com.semifir.surface.models.Categorie;
import com.semifir.surface.repositories.CategorieRepository;

public class CategorieServiceImpl implements CategorieService{
	
	private CategorieRepository categorieRepository;

	public CategorieServiceImpl(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}
	@Override
	public List<Categorie> findAll() {
		return this.categorieRepository.findAll();
	}

	@Override
	public Categorie findOne(Long id) {
		return this.categorieRepository.findById(id).get();
	}

	@Override
	public Categorie create(Categorie categorie) {
		return this.categorieRepository.save(categorie);
	}

	@Override
	public Categorie update(Categorie categorie) {
		return this.categorieRepository.save(categorie);
	}

	@Override
	public void delete(Long id) {
		this.categorieRepository.deleteById(id);
	}

}
