package ru.rybinskov.warehouse.service.deleviry_type_service;

import ru.rybinskov.warehouse.dto.DeliveryTypeDto;
import ru.rybinskov.warehouse.exception.ResourceNotFoundException;

import java.util.List;

public interface DeliveryTypeService {
    List<DeliveryTypeDto> findAll();
    DeliveryTypeDto findById(Long id) throws ResourceNotFoundException;
    DeliveryTypeDto save(DeliveryTypeDto deliveryTypeDto) throws ResourceNotFoundException;
    void delete(Long id);
    void saveAll(List<DeliveryTypeDto> deliveryTypeDto);
}
