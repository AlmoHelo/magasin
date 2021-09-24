package com.semifir.surface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.semifir.surface.repositories.ProduitRepository;
import com.semifir.surface.services.ProduitService;
import com.semifir.surface.services.ProduitServiceImpl;

@Configuration
public class ProduitConfig {
	
	@Bean
	public ProduitService produitService(ProduitRepository produitRepository) {
		return new ProduitServiceImpl(produitRepository);
	}

}
