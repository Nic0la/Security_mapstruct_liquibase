package com.liparitechnology.demo3.mapper;

import com.liparitechnology.demo3.dto.IngredientDto;
import org.mapstruct.Mapper;

@Mapper
public interface IngredientMapper {
    IngredientDto toDto(IngredientDto ingredientDto);
}
