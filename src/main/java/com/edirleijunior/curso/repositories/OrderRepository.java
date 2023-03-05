package com.edirleijunior.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edirleijunior.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
		
}