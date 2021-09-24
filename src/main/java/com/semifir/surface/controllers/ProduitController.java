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

import com.semifir.surface.models.Produit;
import com.semifir.surface.services.ProduitService;


@RestController
@CrossOrigin
@RequestMapping("produits")
public class ProduitController {

	private static Logger LOGGER = LoggerFactory.getLogger(ProduitController.class);
	
	@Autowired
	private ProduitService produitService;
	
	@GetMapping("")
	public List<Produit> findAll(){
		LOGGER.info("Liste des produits");
		return produitService.findAll();
	}
	
	@GetMapping("{id}")
	public Produit findOne(@PathVariable Long id){
		return produitService.findOne(id);
	}
	
	@PostMapping("")
	public Produit create(@RequestBody Produit produit) {
		return this.produitService.create(produit);
	}
	
	@PutMapping("")
	public Produit update(@RequestBody Produit produit) {
		return this.produitService.update(produit);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.produitService.delete(id);
	}
}
