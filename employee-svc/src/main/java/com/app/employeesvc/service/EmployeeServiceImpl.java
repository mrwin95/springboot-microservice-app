package com.app.employeesvc.service;

import com.app.employeesvc.entity.Employee;
import com.app.employeesvc.exception.ResourceNotFoundException;
import com.app.employeesvc.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository repository;

    @Override
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("The employee id # " + id + " not found"));
    }

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee deletedEmp = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("The employee id # " + id + " not found"));
        repository.delete(deletedEmp);
    }

    @Override
    public void updateEmployee(Employee employee) {
        Employee updatedEmp = repository.findById(employee.getId()).orElseThrow(() -> new ResourceNotFoundException("The employee id # " + employee.getId() + " not found"));
        repository.saveAndFlush(updatedEmp);
    }
}
