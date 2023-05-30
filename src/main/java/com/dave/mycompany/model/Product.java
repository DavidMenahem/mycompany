package com.dave.mycompany.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String category;

    @Column
    private String productName;

    @Column
    private String supplier;

    @Column
    private double priceCustomer;

    @Column
    private double priceSupplier;

    @Column
    private double profit;

    @Column
    private int amount;
}
