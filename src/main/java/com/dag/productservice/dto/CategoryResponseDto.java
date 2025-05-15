package com.dag.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryResponseDto {
    public CategoryResponseDto(String id, String name, String description, ProductResponseDto[] products) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.products = products;
    }
    String id;
    String name;
    String description;
    ProductResponseDto[] products;
}
