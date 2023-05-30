package com.dave.mycompany.service;

import com.dave.mycompany.model.Department;
import com.dave.mycompany.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public Department add(Department department){
        return departmentRepository.save(department);
    }

    public Department update(Department department){
        return departmentRepository.save(department);
    }

    public void delete (Integer id){
        departmentRepository.deleteById(id);
    }

    public Department getOne(Integer id){
        Optional<Department> department = departmentRepository.findById(id);
        if(department.isPresent()){
            return department.get();
        }else{
            return null;
        }
    }
}
