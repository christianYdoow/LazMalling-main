package com.example.demo.dto.user;



public class UserDto {

    private Long productId;

    public UserDto() {
    }

    public UserDto(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
