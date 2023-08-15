package com.vti.demospringbootrestapi.service;

import com.vti.demospringbootrestapi.model.Product;
import com.vti.demospringbootrestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Configurable
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product insert(Product product){
        return productRepository.save(product);
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
