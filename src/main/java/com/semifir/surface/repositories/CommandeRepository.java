package com.semifir.surface.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semifir.surface.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{

	public List<Commande> findByClientId(Long id);

}
