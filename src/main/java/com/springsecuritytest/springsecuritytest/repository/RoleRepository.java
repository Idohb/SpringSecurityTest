package com.springsecuritytest.springsecuritytest.repository;

import com.springsecuritytest.springsecuritytest.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}