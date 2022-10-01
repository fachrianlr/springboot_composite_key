package com.example.samplewebapp.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CustomerEmbeddable implements Serializable {
    String name;
    String surname;
}
