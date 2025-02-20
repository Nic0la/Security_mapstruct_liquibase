package com.liparitechnology.demo3.dto;

import com.liparitechnology.demo3.model.entity.Recipe;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class CategoryDto {

    private Long id;
    String categoryName;
    List<RecipeDto> allRecipe = new ArrayList<>();
}
