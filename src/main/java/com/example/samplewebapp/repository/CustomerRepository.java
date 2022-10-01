package com.example.samplewebapp.repository;

import com.example.samplewebapp.entity.Customer;
import com.example.samplewebapp.entity.CustomerEmbeddable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

 

 

public interface CustomerRepository extends CrudRepository<Customer, CustomerEmbeddable> {

    List<Customer> findByEmail(String email);
}
 
