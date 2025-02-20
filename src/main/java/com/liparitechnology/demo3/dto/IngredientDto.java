package com.liparitechnology.demo3.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IngredientDto {

    private Long id;
    String ingredientName;
    int quantity;
}
