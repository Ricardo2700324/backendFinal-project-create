package com.dsworkfinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsworkfinal.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
}
