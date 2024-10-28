package com.example.gestionEmployee.Repository;

import com.example.gestionEmployee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}