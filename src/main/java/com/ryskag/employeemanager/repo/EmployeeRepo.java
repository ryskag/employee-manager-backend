package com.ryskag.employeemanager.repo;

import com.ryskag.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    // needs to return Optional in case there is no such id
    Optional<Employee> findEmployeeById(Long id);
}