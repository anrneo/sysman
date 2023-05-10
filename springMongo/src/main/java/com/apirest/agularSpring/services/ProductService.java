package com.apirest.agularSpring.services;

import com.apirest.agularSpring.model.Product;
import com.apirest.agularSpring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public Product findById(String id){
        return productRepository.findById(id).get();
    }

    public void delete(String id){
        productRepository.deleteById(id);
    }

    public List<Product> getByStatus(Boolean status){
        return productRepository.findByStatus(status);
    }


}
