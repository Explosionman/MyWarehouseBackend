package ru.rybinskov.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rybinskov.warehouse.domain.DeliveryTime;

public interface DeliveryTimeRepository extends JpaRepository <DeliveryTime, Long> {
}
