package com.immoerp.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.immoerp.productservice.entity.Product;
import com.immoerp.productservice.repository.ProductRepository;

import io.swagger.annotations.Api;

@RestController
@ResponseBody
@RequestMapping("/products")
@Api("/products")
public class ProductController {

	
	@Autowired
	private ProductRepository productRepository;
	
	
	@GetMapping("/all")
	public List<Product>retrieveAllProducts() {
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product retrieveAllProducts(@RequestBody @ModelAttribute @PathVariable("id") Long productId) {
		return productRepository.findProductById(productId);
	}
	
	@PostMapping("/add")
	public void addProduct(@RequestBody Product product) {
		productRepository.save(product);
	}
	
	
	@DeleteMapping("/delete/{productId}")
	public void deleteProduct(@RequestBody @ModelAttribute @PathVariable Long productId ) {
		productRepository.deleteById(productId);
	}
}
