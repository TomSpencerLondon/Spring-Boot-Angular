package com.example.springbootangular.controllers;

import com.example.springbootangular.entities.Person;
import com.example.springbootangular.repositories.PersonRepository;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {
  private final PersonRepository personRepository;

  public PersonController(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @GetMapping("/users")
  public List<Person> getUsers() {
    return (List<Person>) personRepository.findAll();
  }

  @PostMapping("/users")
  void addUser(@RequestBody Person person) {
    personRepository.save(person);
  }
}
