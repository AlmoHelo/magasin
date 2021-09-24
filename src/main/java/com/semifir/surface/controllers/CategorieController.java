package com.semifir.surface.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semifir.surface.models.Categorie;
import com.semifir.surface.services.CategorieService;

@RestController
@CrossOrigin
@RequestMapping("categories")
public class CategorieController {

	private static Logger LOGGER = LoggerFactory.getLogger(CategorieController.class);
	
	@Autowired
	private CategorieService categorieService;
	
	@GetMapping("")
	public List<Categorie> findAll(){
		LOGGER.info("Liste des clients");
		return categorieService.findAll();
	}
	
	@GetMapping("{id}")
	public Categorie findOne(@PathVariable Long id){
		return categorieService.findOne(id);
	}
	
	@PostMapping("")
	public Categorie create(@RequestBody Categorie categorie) {
		return this.categorieService.create(categorie);
	}
	
	@PutMapping("")
	public Categorie update(@RequestBody Categorie categorie) {
		return this.categorieService.update(categorie);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.categorieService.delete(id);
	}
}
