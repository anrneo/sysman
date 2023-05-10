package com.apirest.agularSpring.model;

import lombok.Data;
import org.springframework.data.annotation.Id;



@Data
public class Product {
    @Id
    private String id;

    private String name;
    private String description;
    private String type;
    private String serial;
    private String city;
    private Double internalNumber;
    private Double price;
    private Number status;

    private String buyDate;
    private String sellDate;
}
