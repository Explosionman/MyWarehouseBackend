package ru.rybinskov.warehouse.service.role_service;

import ru.rybinskov.warehouse.dto.RoleDto;
import ru.rybinskov.warehouse.exception.ResourceNotFoundException;

import java.util.List;

public interface RoleService {
    List<RoleDto> findAll();
    RoleDto findById(Long id) throws ResourceNotFoundException;
    RoleDto save(RoleDto roleDto) throws ResourceNotFoundException;
    void delete(Long id);
    void saveAll(List<RoleDto> roleDto);
}
