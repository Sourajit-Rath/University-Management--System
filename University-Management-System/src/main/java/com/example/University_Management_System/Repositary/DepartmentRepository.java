package com.example.University_Management_System.Repositary;

//import com.example.University_Management_System.Repositary.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

