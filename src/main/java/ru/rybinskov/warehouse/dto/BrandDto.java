package ru.rybinskov.warehouse.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rybinskov.warehouse.domain.Brand;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrandDto {
    private Long id;
    private String name;
    private String abbr;

    public BrandDto(Brand brand) {
        this.id = brand.getId();
        this.name = brand.getName();
        this.abbr = brand.getAbbr();
    }

}


