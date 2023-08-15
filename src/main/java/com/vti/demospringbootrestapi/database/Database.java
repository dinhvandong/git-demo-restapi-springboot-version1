package com.vti.demospringbootrestapi.database;

import com.vti.demospringbootrestapi.model.Product;
import com.vti.demospringbootrestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    @Bean
    CommandLineRunner initDatabase(
                                   ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

                Product product = new Product();
                product.setId(1l);
                product.setName("Laptop");
                product.setDesc("Laptop gia re, chat luong");
                product.setType("Laptop gaming");
                productRepository.save(product);

            }
        };}
}
