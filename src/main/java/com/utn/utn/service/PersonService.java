package com.utn.utn.service;

import com.utn.utn.model.Person;
import com.utn.utn.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService (final PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void add(final Person person){
        personRepository.save(person);
    }

    public List<Person> getPerson()
    {
        return personRepository.findAll();
    }

    public Person getPersonById(Integer personId) {
        return personRepository.findById(personId).get();
        /*
                .orElseThrow(new HTTPException(HttpStatus.NOT_FOUND.value()))*/

    }
}
