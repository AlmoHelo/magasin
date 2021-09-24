package com.semifir.surface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.semifir.surface.repositories.CommandeRepository;
import com.semifir.surface.services.CommandeService;
import com.semifir.surface.services.CommandeServiceImpl;

@Configuration
public class CommandeConfig {

	@Bean
	public CommandeService commandeService(CommandeRepository commandeRepository) {
		return new CommandeServiceImpl(commandeRepository);
	}

}
