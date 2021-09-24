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

import com.semifir.surface.models.Client;
import com.semifir.surface.services.ClientService;


@RestController
@CrossOrigin
@RequestMapping("clients")
public class ClientController {

	private static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("")
	public List<Client> findAll(){
		LOGGER.info("Liste des clients");
		return clientService.findAll();
	}
	
	@GetMapping("{id}")
	public Client findOne(@PathVariable Long id){
		return clientService.findOne(id);
	}
	
	@PostMapping("")
	public Client create(@RequestBody Client client) {
		return this.clientService.create(client);
	}
	
	@PutMapping("")
	public Client update(@RequestBody Client client) {
		return this.clientService.update(client);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.clientService.delete(id);
	}
	
}
