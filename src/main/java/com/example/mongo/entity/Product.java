package com.example.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@ToString
@Document
public class Product {
    @Id
    private String id;
    private String name;
    private BigDecimal price;
}