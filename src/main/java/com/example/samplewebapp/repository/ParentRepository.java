package com.example.samplewebapp.repository;


import com.example.samplewebapp.entity.Parent;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface ParentRepository extends CrudRepository<Parent, String> {

    Optional<Parent> findByName(String surname);
}