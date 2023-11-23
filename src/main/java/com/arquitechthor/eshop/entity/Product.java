package com.arquitechthor.eshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@Table(name = "PRODUCTS")
public class Product {

	@Id
    @Column(name = "PRODUCT_ID")
    private Long id;
    
    @Column(name = "NAME")
    private String name;
    
}
