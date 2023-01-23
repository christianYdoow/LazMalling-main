package com.example.demo.dto.product;

import com.example.demo.model.Category;
import lombok.Data;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
public class ProductDto {
    private Long productId;
    private long categoryId;

    private String productName;

    private String productDescription;
    private double productPrice;
    private double productQuantity;
    private String imageName;

}
