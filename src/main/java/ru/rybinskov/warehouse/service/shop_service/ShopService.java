package ru.rybinskov.warehouse.service.shop_service;

import ru.rybinskov.warehouse.dto.ShopDto;
import ru.rybinskov.warehouse.exception.ResourceNotFoundException;

import java.util.List;

public interface ShopService {

    ShopDto findById(Long id) throws ResourceNotFoundException;
    List<ShopDto> findAll();
    ShopDto save(ShopDto shopDto) throws ResourceNotFoundException;
    void delete(Long id);
    void saveAll(List<ShopDto> shopDtos);
}
