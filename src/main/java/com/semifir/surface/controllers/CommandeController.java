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

import com.semifir.surface.models.Commande;
import com.semifir.surface.services.CommandeService;

@RestController
@CrossOrigin
@RequestMapping("commandes")
public class CommandeController {

	private static Logger LOGGER = LoggerFactory.getLogger(CommandeController.class);
	
	@Autowired
	private CommandeService commandeService;
	
	@GetMapping("")
	public List<Commande> findAll(){
		LOGGER.info("Liste des clients");
		return commandeService.findAll();
	}
	
	@GetMapping("{id}")
	public Commande findOne(@PathVariable Long id){
		return commandeService.findOne(id);
	}
	
	@PostMapping("")
	public Commande create(@RequestBody Commande commande) {
		return this.commandeService.create(commande);
	}
	
	@PutMapping("")
	public Commande update(@RequestBody Commande commande) {
		return this.commandeService.update(commande);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.commandeService.delete(id);
	}

}
