package com.immoerp.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.immoerp.productservice.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	Product findProductById(Long id);
}
