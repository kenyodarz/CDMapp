package com.cdm.appweb.repository;

import java.util.Optional;

import com.cdm.appweb.models.ERole;
import com.cdm.appweb.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/* Interfaz que maneja el repositorio de la clase Role a traves de hibernate y JPA */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
