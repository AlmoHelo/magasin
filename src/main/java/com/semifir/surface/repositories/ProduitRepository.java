package com.semifir.surface.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semifir.surface.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
