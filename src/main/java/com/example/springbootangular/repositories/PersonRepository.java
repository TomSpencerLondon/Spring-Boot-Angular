package com.example.springbootangular.repositories;

import com.example.springbootangular.entities.Person;
import java.util.List;

public interface PersonRepository {
  Person save(Person person);
  List<Person> findAll();
}
