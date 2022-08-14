package com.app.departmentsvc.service;

import com.app.departmentsvc.entity.Department;
import com.app.departmentsvc.exception.DepartmentNotFoundException;
import com.app.departmentsvc.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{
    private final DepartmentRepository repository;

    @Override
    public List<Department> selectByCode(String code) {
        return repository.findByCode(code);
    }

    @Override
    public List<Department> selectAll() {
        return repository.findAll();
    }
    @Override
    public Department selectById(Long id) {
        return repository.findById(id).orElseThrow(() -> new DepartmentNotFoundException("The department with id #" + id + " not found."));
    }

    @Override
    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    @Override
    public void deleteDepartment(Long id) {
        Department department = this.selectById(id);
        repository.delete(department);
    }

    @Override
    public void updateDepartment(Department department) {
        Department updatedDepartment = this.selectById(department.getId());
        repository.saveAndFlush(updatedDepartment);
    }
}
