package com.springboot_tutorial.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.springboot_tutorial.demo.model.Person;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao {

    @Override
    public int deletePersonById(UUID id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int insertPerson(UUID id, Person person) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Person> selectALLPeople() {
        // TODO Auto-generated method stub
        return List.of(new Person(UUID.randomUUID(), "from postgres DB"));
    }

    @Override
    public Optional<Person> selectPerosnById(UUID id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
