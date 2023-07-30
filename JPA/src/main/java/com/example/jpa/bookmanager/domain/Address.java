package com.example.jpa.bookmanager.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
