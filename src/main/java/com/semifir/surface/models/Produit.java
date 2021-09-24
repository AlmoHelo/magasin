package com.semifir.surface.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name= "prix")
	private Float prix;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "categorie_id", referencedColumnName = "id")
	private Categorie categorie;
	
	@ManyToOne
	@JoinColumn(name="commande_id", referencedColumnName = "id")
	private Commande commande;
}
