package com.liparitechnology.demo3.model.repository;

import com.liparitechnology.demo3.model.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeReposiotory extends JpaRepository<Recipe, Long> {
}
