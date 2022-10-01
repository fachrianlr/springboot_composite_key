package com.example.samplewebapp.entity;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Customer {
	
  @EmbeddedId
  private CustomerEmbeddable customerPK;
  String address;
  String email;

}
