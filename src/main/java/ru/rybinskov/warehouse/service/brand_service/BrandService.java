package ru.rybinskov.warehouse.service.brand_service;

import ru.rybinskov.warehouse.dto.BrandDto;
import ru.rybinskov.warehouse.exception.ResourceNotFoundException;

import java.util.List;

public interface BrandService {

    List<BrandDto> findAll();
    BrandDto findById(Long id) throws ResourceNotFoundException;
    void delete(Long id);
    void saveAll(List<BrandDto> brandDtos);
    BrandDto save(BrandDto brandDto) throws ResourceNotFoundException;
}
