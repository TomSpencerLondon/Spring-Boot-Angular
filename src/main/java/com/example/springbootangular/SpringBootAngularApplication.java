package com.example.springbootangular;

import com.example.springbootangular.entities.Person;
import com.example.springbootangular.repositories.PersonRepository;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAngularApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootAngularApplication.class, args);
  }

  @Bean
  CommandLineRunner init(PersonRepository personRepository) {
    return args -> {
      Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
        Person user = new Person(name, name.toLowerCase() + "@domain.com");
        personRepository.save(user);
      });

      personRepository.findAll().forEach(System.out::println);
    };
  }
}
