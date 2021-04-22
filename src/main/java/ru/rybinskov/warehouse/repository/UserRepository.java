package ru.rybinskov.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rybinskov.warehouse.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
}
