package com.app.employeesvc.repository;

import com.app.employeesvc.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public Employee findEmployeeByFirstName(String firstName);

}
