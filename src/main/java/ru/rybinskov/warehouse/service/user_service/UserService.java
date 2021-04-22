package ru.rybinskov.warehouse.service.user_service;

import ru.rybinskov.warehouse.exception.ResourceNotFoundException;
import ru.rybinskov.warehouse.exception.WarehouseException;
import ru.rybinskov.warehouse.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getById(Long id) throws ResourceNotFoundException;
    List<UserDto> findAll();
    UserDto save(UserDto userDto) throws ResourceNotFoundException, WarehouseException;
    void delete(Long id) throws ResourceNotFoundException;

}
