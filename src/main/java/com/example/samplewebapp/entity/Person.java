package com.example.samplewebapp.entity;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@IdClass(PersonId.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
	
    @Id
    String name;

    @Id
    @Column(name = "parent_id")
    String parentId;

    String address;
    String email;

}