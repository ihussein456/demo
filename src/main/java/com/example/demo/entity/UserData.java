package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter//The entity interacts with the database
@Entity
@Table(name = "my_table")
public class UserData {
    //an id is always needed to index the data
    //the annotation GeneratedValue allows the data to be generated automatically
    //and we add the name of the columns where the data goes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
}