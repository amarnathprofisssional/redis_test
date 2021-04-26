package com.example.demo.repository;

import com.example.demo.dao.Persons;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Persons,Integer> {
}
