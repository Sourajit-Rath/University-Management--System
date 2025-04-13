package com.example.University_Management_System;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private String email;

    @OneToMany(mappedBy = "professor")
    private List<Course> courses = new ArrayList<>();

    // Getters and Setters
}

