package ru.rybinskov.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rybinskov.warehouse.domain.DeliveryType;

public interface DeliveryTypeRepository extends JpaRepository <DeliveryType, Long> {
}
