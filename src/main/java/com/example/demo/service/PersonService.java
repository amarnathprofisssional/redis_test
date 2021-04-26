package com.example.demo.service;

import com.example.demo.dao.Persons;

import java.util.Optional;

public interface PersonService {
    public Persons savePerson(Persons persons);

    Optional<Persons> fetchPerson(int id);
}
