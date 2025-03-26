package com.example.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.math.BigDecimal;
import java.util.List;
import com.example.mongo.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

    //finder(query) methods
    List<Product> findByName(String name);

    //jpql style methods
    @Query("{  'name' : ?0, 'price' : ?1}")
    List<Product> findByMyParams(String n, BigDecimal p);
}
