package ru.rybinskov.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rybinskov.warehouse.domain.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
