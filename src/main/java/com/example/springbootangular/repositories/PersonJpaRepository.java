package com.example.springbootangular.repositories;

import com.example.springbootangular.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaRepository extends JpaRepository<Person, Long> {}
