package com.example.University_Management_System;


import jakarta.persistence.*;
import java.util.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String building;

    @OneToMany(mappedBy = "department")
    private List<Professor> professors = new ArrayList<>();

    // Getters and Setters
}
