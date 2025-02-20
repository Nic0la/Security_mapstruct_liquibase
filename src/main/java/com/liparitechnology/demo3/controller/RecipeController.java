package com.liparitechnology.demo3.controller;

import com.liparitechnology.demo3.controller.helper.ControllerHelper;
import com.liparitechnology.demo3.controller.helper.ControllerHelperImpl;
import com.liparitechnology.demo3.dto.RecipeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private ControllerHelperImpl ch;

    @GetMapping
    public List<RecipeDto> getAllRecipes() {
        return ch.getAllRecipes();
    }
}
