package com.edirleijunior.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edirleijunior.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
}