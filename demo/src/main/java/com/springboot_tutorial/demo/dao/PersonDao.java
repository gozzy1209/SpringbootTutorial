package com.springboot_tutorial.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.springboot_tutorial.demo.model.Person;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    
    default int insertPerson(Person person){
        UUID id=UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectALLPeople();

    Optional<Person> selectPerosnById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
