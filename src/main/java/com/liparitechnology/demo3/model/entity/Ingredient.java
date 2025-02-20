package com.liparitechnology.demo3.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Setter
@Getter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String ingredientName;
    int quantity;

    @OneToMany(mappedBy = "ingredient")
    Set<IngredientsToRecipe> ingredients = new HashSet<>();



}
