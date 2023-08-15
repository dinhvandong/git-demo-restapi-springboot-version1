package com.vti.demospringbootrestapi.repository;

import com.vti.demospringbootrestapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
