package com.springboot_tutorial.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springboot_tutorial.demo.dao.PersonDao;
import com.springboot_tutorial.demo.model.Person;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    //decide which DB(database) that we use
    //just one line to change DB
    public PersonService(@Qualifier("postgres") PersonDao personDao) {
        this.personDao = personDao;
    }



    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectALLPeople();
    }

    public Optional<Person> getPersonById(UUID id){
        return personDao.selectPerosnById(id);
    }
    
    public int deletePerson(UUID id){
        return personDao.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person newperson){
        return personDao.updatePersonById(id, newperson);

    }
}
