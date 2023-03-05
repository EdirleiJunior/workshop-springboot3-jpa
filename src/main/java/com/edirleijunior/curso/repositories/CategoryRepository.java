package com.edirleijunior.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edirleijunior.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
		
}