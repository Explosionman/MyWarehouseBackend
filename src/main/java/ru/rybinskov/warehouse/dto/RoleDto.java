package ru.rybinskov.warehouse.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rybinskov.warehouse.domain.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleDto {

    private Long id;
    private String role;

    public RoleDto(Role role) {
        this.id = role.getId();
        this.role = role.getRoleName();
    }
}
