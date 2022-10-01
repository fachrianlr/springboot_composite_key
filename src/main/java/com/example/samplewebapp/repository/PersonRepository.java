package com.example.samplewebapp.repository;



import com.example.samplewebapp.entity.Person;
import com.example.samplewebapp.entity.PersonId;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, PersonId> {

    List<Person> findBySurname(String surname);
}