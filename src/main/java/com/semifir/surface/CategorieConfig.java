package com.semifir.surface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.semifir.surface.repositories.CategorieRepository;
import com.semifir.surface.services.CategorieService;
import com.semifir.surface.services.CategorieServiceImpl;

@Configuration
public class CategorieConfig {
	
	@Bean
	public CategorieService categorieService(CategorieRepository categorieRepository) {
		return new CategorieServiceImpl(categorieRepository);
	}

}
