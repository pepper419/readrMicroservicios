package com.monaschinas.readr.user.domain.persistence;

import com.monaschinas.readr.user.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(String name);
  boolean existsByName(String name);
}
