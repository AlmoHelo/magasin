package com.semifir.surface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.semifir.surface.repositories.ClientRepository;
import com.semifir.surface.repositories.CommandeRepository;
import com.semifir.surface.services.ClientService;
import com.semifir.surface.services.ClientServiceImpl;

@Configuration
public class ClientConfig {
	
	@Bean
	public ClientService clientService(ClientRepository clientRepository, CommandeRepository commandeRepository) {
		return new ClientServiceImpl(clientRepository, commandeRepository);
	}
	
}
