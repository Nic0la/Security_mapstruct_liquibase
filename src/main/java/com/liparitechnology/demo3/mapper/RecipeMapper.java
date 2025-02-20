package com.liparitechnology.demo3.mapper;

import com.liparitechnology.demo3.dto.RecipeDto;
import com.liparitechnology.demo3.model.entity.Recipe;
import org.mapstruct.Mapper;

@Mapper
public interface RecipeMapper {
    RecipeDto toDto(Recipe recipe);
}
