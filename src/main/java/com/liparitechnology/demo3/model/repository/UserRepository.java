package com.liparitechnology.demo3.model.repository;

import com.liparitechnology.demo3.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String Username);
}
