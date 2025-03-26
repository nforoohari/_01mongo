package com.example.mongo;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.util.List;
import com.example.mongo.entity.Product;
import com.example.mongo.repository.ProductRepository;

@SpringBootTest
class MongoApplicationTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void saveProduct() {
        Product product = new Product();
        product.setName("tablet");
        product.setPrice(new BigDecimal("5000"));
        Product savedProduct = productRepository.save(product);
        System.out.println("product id : "+ savedProduct.getId());
    }

    @Test
    void findAll() {
        List<Product> all = productRepository.findAll();
        all.forEach(System.out::println);
    }

    @Test
    void findByName() {
        List<Product> products = productRepository.findByName("tablet");
        products.forEach(System.out::println);
    }

    @Test
    void findByMyParams() {
        List<Product> products = productRepository.findByMyParams("car", new BigDecimal(1000));
        products.forEach(System.out::println);
    }
}
