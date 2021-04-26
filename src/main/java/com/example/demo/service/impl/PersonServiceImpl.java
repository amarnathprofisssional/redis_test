package com.example.demo.service.impl;

import com.example.demo.dao.Persons;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Persons savePerson(Persons persons) {
        return personRepository.save(persons);
    }

    @Override
    public Optional<Persons> fetchPerson(int id) {
        return personRepository.findById(id);
    }
}
