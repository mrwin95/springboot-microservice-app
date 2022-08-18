package com.app.employeesvc.client;

import com.app.employeesvc.dto.DepartmentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface DepartmentClient {

    @GetMapping("/department/{departmentId}")
    public List<DepartmentDTO> findByDepartmentId(@PathVariable Long departmentId);
}
