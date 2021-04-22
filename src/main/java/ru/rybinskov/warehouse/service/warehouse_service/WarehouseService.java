package ru.rybinskov.warehouse.service.warehouse_service;

import ru.rybinskov.warehouse.dto.WarehouseDto;
import ru.rybinskov.warehouse.exception.ResourceNotFoundException;

import java.util.List;

public interface WarehouseService {

    WarehouseDto findById(Long id) throws ResourceNotFoundException;
    List<WarehouseDto> findAll();
    WarehouseDto save(WarehouseDto warehouseDto) throws ResourceNotFoundException;
    void delete(Long id);
    public void saveAll(List<WarehouseDto> warehouseDtos);
}
