package ru.rybinskov.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rybinskov.warehouse.domain.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
