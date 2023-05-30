package com.dave.mycompany.service;

import com.dave.mycompany.model.Department;
import com.dave.mycompany.model.Employee;
import com.dave.mycompany.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentService departmentService;

    public Employee add(final Employee employee){
        Employee employee1 = employeeRepository.save(employee);
        updateNumOfEmployees(employee, 1);
        return employee1;
    }

    public Employee update(final Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee getOne(final Integer id){
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }else{
            return null;
        }
    }

    public void delete(final  Integer id){
        Employee employee = getOne(id);
        updateNumOfEmployees(employee, -1);
        employeeRepository.deleteById(id);
    }

    public void updateNumOfEmployees(final Employee employee, Integer value){
        Department department  = departmentService.getOne(employee.getDepartment().getId());
        department.setNumOfEmployees(department.getNumOfEmployees() + value);
        departmentService.update(department);

    }
}
