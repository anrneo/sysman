package com.apirest.agularSpring.controller;

import com.apirest.agularSpring.model.Product;
import com.apirest.agularSpring.repository.ProductRepository;
import com.apirest.agularSpring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.findAll();
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable String id, @RequestBody Product product){
        Product data = productService.findById(id);
        data.setName(product.getName());
        data.setDescription(product.getDescription());
        data.setType(product.getType());
        data.setSerial(product.getSerial());
        data.setInternalNumber(product.getInternalNumber());
        data.setPrice(product.getPrice());
        data.setBuyDate(product.getBuyDate());
        data.setSellDate(product.getSellDate());
        data.setCity(product.getCity());
        data.setStatus(product.getStatus());
        return productService.save(data);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id){
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public Product getOne(@PathVariable String id){
        Product data = productService.findById(id);
        return data;
    }

    @GetMapping("/status")
    public List<Product> getByStatus(@RequestParam("status") Boolean status){
        return productService.getByStatus(status);
    }


}
