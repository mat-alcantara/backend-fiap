package com.godigital.inove.repository;

import java.util.UUID;

import com.godigital.inove.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
