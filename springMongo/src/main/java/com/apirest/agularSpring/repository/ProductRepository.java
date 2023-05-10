package com.apirest.agularSpring.repository;

import com.apirest.agularSpring.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    public abstract List<Product> findByStatus(Boolean status);

}
