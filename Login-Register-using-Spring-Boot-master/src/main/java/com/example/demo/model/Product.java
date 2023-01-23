package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "category_id",referencedColumnName = "category_id")
    private Category category;

    private String productName;

    private String productDescription;

    private double productPrice;

    private double productQuantity;

    private String imageName;
}
