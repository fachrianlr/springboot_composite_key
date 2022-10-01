package com.example.samplewebapp;

import com.example.samplewebapp.entity.Customer;
import com.example.samplewebapp.entity.CustomerEmbeddable;
import com.example.samplewebapp.entity.Parent;
import com.example.samplewebapp.entity.Person;
import com.example.samplewebapp.entity.PersonId;
import com.example.samplewebapp.repository.CustomerRepository;
import com.example.samplewebapp.repository.ParentRepository;
import com.example.samplewebapp.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}