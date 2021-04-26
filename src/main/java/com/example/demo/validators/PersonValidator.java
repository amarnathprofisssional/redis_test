package com.example.demo.validators;

import com.example.demo.dao.Persons;
import com.example.demo.exception.CustomException;

public class PersonValidator {
    public static void personSaveValidation(Persons persons){
        if(persons==null || persons.getAge()==0|| persons.getFirstName() == null
                || persons.getLastName() == null){
            throw new CustomException("Error in request persons", "1001");
        }
    }
}
