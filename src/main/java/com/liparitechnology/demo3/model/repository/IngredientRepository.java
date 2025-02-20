package com.liparitechnology.demo3.model.repository;

import com.liparitechnology.demo3.model.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
