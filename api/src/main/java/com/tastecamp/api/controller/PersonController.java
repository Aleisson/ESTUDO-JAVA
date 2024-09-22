package com.tastecamp.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.PersonDTO;
import com.tastecamp.api.model.Person;
import com.tastecamp.api.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/person")
public class PersonController {

  @Autowired
  private PersonRepository repository;

  @GetMapping
  public List<Person> listAll() {
    return repository.findAll();
  }

  @PostMapping
  public void create(@RequestBody PersonDTO req) {
    repository.save(new Person(req));
  }

}
