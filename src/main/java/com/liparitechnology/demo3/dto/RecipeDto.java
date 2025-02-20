package com.liparitechnology.demo3.dto;

import com.liparitechnology.demo3.model.entity.Category;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RecipeDto {
    private Long id;
    private String recipeName;
    private String categoryName;
    CategoryDto category;
}
