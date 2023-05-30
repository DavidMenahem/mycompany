package com.dave.mycompany.controller;

import com.dave.mycompany.model.Employee;
import com.dave.mycompany.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public Employee add(@RequestBody final Employee employee){
        return employeeService.add(employee);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable final Integer id){
        employeeService.delete(id);
    }
}
