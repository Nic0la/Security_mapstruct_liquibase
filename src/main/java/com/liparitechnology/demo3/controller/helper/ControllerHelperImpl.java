package com.liparitechnology.demo3.controller.helper;

import com.liparitechnology.demo3.dto.RecipeDto;
import com.liparitechnology.demo3.mapper.RecipeMapper;
import com.liparitechnology.demo3.model.entity.Recipe;
import com.liparitechnology.demo3.model.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ControllerHelperImpl implements ControllerHelper {

    @Autowired
    private RecipeMapper recipeMapper;

    @Autowired
    public RecipeRepository reciRepo;

    @Override
    public List<RecipeDto> getAllRecipes() {
        List<Recipe> recipes = reciRepo.findAll();
        List<RecipeDto> recipeDtos = new ArrayList<>();
        for (Recipe recipe : recipes) {
            RecipeDto recipeDto = recipeMapper.toDto(recipe);
            recipeDtos.add(recipeDto);
        }
        return recipeDtos;
    }
}
