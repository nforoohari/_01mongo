package com.example.mongo.repository;

import com.example.mongo.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {
    //finder  yes
    List<Product> findByName(String name);
    //jpql    @@uery
    @Query("{ 'name' : ?0}")
    List<Product> findByName2(@Param("name") String name);
    //

}
