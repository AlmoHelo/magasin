package com.semifir.surface.services;

import java.util.List;

import com.semifir.surface.models.Categorie;

public interface CategorieService {

	List<Categorie> findAll();

	Categorie findOne(Long id);

	Categorie create(Categorie categorie);

	Categorie update(Categorie categorie);

	void delete(Long id);

}
