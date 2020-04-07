package com.utn.utn.controller;


import com.utn.utn.model.Person;
import com.utn.utn.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController // expones la ruta y recibir peticiones de afuera. Por eso el Get y el Post.
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @Autowired // del llamado al @Autowired que ejecuta al constructor, despues hace una inyeccion de dependencia.
    public PersonController(final PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/")
    public List<Person> getPerson(){
        return personService.getPerson();
    }

    @GetMapping("/{personId}")
    public Person getPersonById(@PathVariable Integer personId){

        return personService.getPersonById(personId);
    }

    @PostMapping("/")
    public void addPerson(@RequestBody @Valid Person person){
        personService.add(person);
    }
}
