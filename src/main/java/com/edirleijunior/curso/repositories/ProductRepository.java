package com.edirleijunior.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edirleijunior.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
		
}