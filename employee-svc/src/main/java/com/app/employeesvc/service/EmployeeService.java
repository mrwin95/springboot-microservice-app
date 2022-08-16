package com.app.employeesvc.service;

import com.app.employeesvc.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);

    public Employee findEmployeeById(Long id);

    public List<Employee> findAll();

    public void deleteEmployee(Long id);

    public void updateEmployee(Employee employee);

}
