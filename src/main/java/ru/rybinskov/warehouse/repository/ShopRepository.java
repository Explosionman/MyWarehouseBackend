package ru.rybinskov.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rybinskov.warehouse.domain.Shop;

public interface ShopRepository extends JpaRepository<Shop, Long> {
    Shop findShopsByName(String name);
}
