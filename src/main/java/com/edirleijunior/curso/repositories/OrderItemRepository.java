package com.edirleijunior.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edirleijunior.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
		
}