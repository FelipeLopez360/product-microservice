package com.felipelopez.product_microservice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "product")
@Data
public class ProductEntity {
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private Double unitPrice;

}
