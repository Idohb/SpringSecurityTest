package com.springsecuritytest.springsecuritytest.repository;

import com.springsecuritytest.springsecuritytest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsernameOrEmail(String username, String email);
}
