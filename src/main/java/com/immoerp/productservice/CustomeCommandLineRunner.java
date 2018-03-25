package com.immoerp.productservice;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.immoerp.productservice.entity.Product;
import com.immoerp.productservice.repository.ProductRepository;

@Component
public class CustomeCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public void run(String... args) throws Exception{
		Stream.of(new Product("product1", 33.5, 1050), new Product("product2", 10d, 543), new Product("product3", 25.13, 2000), 
				new Product("product4", 541.25, 54), new Product("product5", 88.99, 1550)).forEach(product -> productRepository.save(product));
		
		productRepository.findAll().forEach(System.out::println);
	}

}
