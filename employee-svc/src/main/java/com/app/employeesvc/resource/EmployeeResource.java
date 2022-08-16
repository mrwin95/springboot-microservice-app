package com.app.employeesvc.resource;

import com.app.employeesvc.dto.EmployeeDataResponse;
import com.app.employeesvc.entity.Employee;
import com.app.employeesvc.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee/")
@Slf4j
@RequiredArgsConstructor
public class EmployeeResource {

    private final EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        log.info("Inside createEmployee method of EmployeeResource");
        Employee emp = employeeService.createEmployee(employee);
        return emp;
    }

    @GetMapping
    public ResponseEntity<EmployeeDataResponse> findAllEmployees(){
        log.info("Inside findAllEmployee of method EmployeeResource");
        return null;
    }
}
