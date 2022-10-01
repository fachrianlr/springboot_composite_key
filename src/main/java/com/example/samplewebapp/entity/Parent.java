package com.example.samplewebapp.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;


@Entity
@Data
public class Parent {

  @Id
  String name;

  @OneToMany(
      mappedBy = "parentId",
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )
  private List<Person> personList = new ArrayList<>();
}
