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
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String recipeName;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    Category category;

    @ManyToMany
    @JoinTable(
            name = "ingredient_for_recipe",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private Set<Ingredient> allIngredient = new HashSet<>();
}
