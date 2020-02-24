package com.cdm.appweb.repository;

import java.util.Optional;

import com.cdm.appweb.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/* Interfaz que maneja el repositorio de la clase User a traves de hibernate y JPA */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
