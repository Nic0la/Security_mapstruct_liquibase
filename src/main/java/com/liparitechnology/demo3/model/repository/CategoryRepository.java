package com.liparitechnology.demo3.model.repository;

import com.liparitechnology.demo3.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
