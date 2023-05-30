package com.dave.mycompany.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department")
@Builder
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "store_id")
    Store store;

    @Column
    private String name;

    @Column
    private Integer numOfEmployees;

    @Column
    private String description;
}
