package com.example.demo.controller;

import com.example.demo.dao.Persons;
import com.example.demo.service.PersonService;
import com.example.demo.validators.PersonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/addPerson")
    public Persons addNewPerson(@RequestBody Persons persons){
        PersonValidator.personSaveValidation(persons);
        return personService.savePerson(persons);
    }

    @GetMapping("/addPerson/{id}")
    public Optional<Persons> addNewPerson(@PathVariable int id){
        return personService.fetchPerson(id);
    }
}
