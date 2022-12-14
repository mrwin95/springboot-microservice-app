package com.app.departmentsvc.service;

import com.app.departmentsvc.entity.Department;

import java.util.List;

public interface DepartmentService {

    public List<Department> selectDepartmentByCode(String code);

    public List<Department> selectAll();

    public Department findDepartmentById(Long id);

    public Department saveDepartment(Department department);

    public void deleteDepartment(Long id);

    public void updateDepartment(Department department);
}
