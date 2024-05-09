package com.miguel.springboot.app.springbootcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.miguel.springboot.app.springbootcrud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
