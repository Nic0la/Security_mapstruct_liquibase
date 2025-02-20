package com.liparitechnology.demo3.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Setter
@Getter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String categoryName;

    @OneToMany(mappedBy = "category")
    List<Recipe> allRecipe = new ArrayList<>();

}
