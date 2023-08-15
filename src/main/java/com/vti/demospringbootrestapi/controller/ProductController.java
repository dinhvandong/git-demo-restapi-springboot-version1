package com.vti.demospringbootrestapi.controller;

import com.vti.demospringbootrestapi.model.Product;
import com.vti.demospringbootrestapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/insert")
    public ResponseEntity<?> insert(@RequestBody Product product) {
        return ResponseEntity.status(HttpStatus.OK).body(
                productService.insert(product));
    }
    @PostMapping("/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(
                productService.findAll());
    }
}
