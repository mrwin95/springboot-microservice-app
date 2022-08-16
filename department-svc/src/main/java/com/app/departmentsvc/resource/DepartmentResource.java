package com.app.departmentsvc.resource;

import com.app.departmentsvc.entity.Department;
import com.app.departmentsvc.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department/")
@RequiredArgsConstructor
@Slf4j
public class DepartmentResource {

    private final DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentResource");
        Department savedDepartment = departmentService.saveDepartment(department);
        return savedDepartment;
    }
    @GetMapping
    public ResponseEntity<List<Department>> selectAllDepartment(){
        List<Department> departmentList = departmentService.selectAll();
        log.info("Inside selectAllDepartment of method Department");
        return ResponseEntity.ok(departmentList);
    }
}
