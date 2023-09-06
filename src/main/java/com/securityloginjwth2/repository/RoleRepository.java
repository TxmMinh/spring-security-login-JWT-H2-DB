package com.securityloginjwth2.repository;

import com.securityloginjwth2.entity.ERole;
import com.securityloginjwth2.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}