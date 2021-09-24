package com.semifir.surface.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semifir.surface.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
