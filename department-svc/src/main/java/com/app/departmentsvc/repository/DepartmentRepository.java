package com.app.departmentsvc.repository;

import com.app.departmentsvc.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public List<Department> findByCode(String code);
}
