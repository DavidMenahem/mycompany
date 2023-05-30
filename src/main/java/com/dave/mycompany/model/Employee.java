package com.dave.mycompany.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@CrossOrigin
@Entity
@Data
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name="name",nullable = false)
    private String name;

    @Column
    private String position;
    @Column
    private Integer salary;
    @Column
    private String startDate;
    @Column
    private String password;
    @Column
    private String address;
    @Column
    private Integer age;
    @Column
    private String phoneNumber;
    @Column
    private String email;
}
