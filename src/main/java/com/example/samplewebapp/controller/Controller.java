package com.example.samplewebapp.controller;


import com.example.samplewebapp.entity.Parent;
import com.example.samplewebapp.entity.Person;
import com.example.samplewebapp.repository.ParentRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/composite")
public class Controller {

  @Autowired
  ParentRepository parentRepository;


  @GetMapping("/test1")
  public String getAllProduct() {
    System.out.println(">>>>>>>>>>>>>>>>>>");
    Optional<Parent> parent = parentRepository.findByName("anis");
    System.out.println(parent.toString());
    return "asdad";
  }
}
