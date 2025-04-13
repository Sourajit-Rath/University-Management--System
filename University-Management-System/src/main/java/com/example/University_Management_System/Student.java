package com.example.University_Management_System;



	import jakarta.persistence.*;
	import java.util.*;

	@Entity
	public class Student {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String email;
	    private String department;

	    @ManyToMany(mappedBy = "enrolledStudents")
	    private List<Course> courses = new ArrayList<>();

	    // Getters and Setters
	}


