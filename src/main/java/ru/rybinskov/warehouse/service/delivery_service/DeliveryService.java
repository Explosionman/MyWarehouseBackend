package ru.rybinskov.warehouse.service.delivery_service;

import ru.rybinskov.warehouse.dto.UniqueReportObject;
import ru.rybinskov.warehouse.exception.ResourceNotFoundException;
import ru.rybinskov.warehouse.exception.WarehouseException;
import ru.rybinskov.warehouse.dto.DeliveryDto;

import java.util.List;

public interface DeliveryService {

    List<DeliveryDto> findAll();
    DeliveryDto findById(Long id) throws ResourceNotFoundException;
    void delete(Long id);
    void saveAll(List<DeliveryDto> deliveryDtos) throws WarehouseException;
    List<DeliveryDto> findByDeliveryDateIsBetween(String first, String second);
    List<DeliveryDto> findByDeliveryDateGreaterThanEqual(String date);
    List<DeliveryDto> findByDeliveryDateLessThanEqual(String date);
    List<DeliveryDto> getByDate(String first, String last);
    DeliveryDto save(DeliveryDto deliveryDto) throws ResourceNotFoundException;
    List<UniqueReportObject> getUniqueDeliveriesByRange(String first, String last);

}
