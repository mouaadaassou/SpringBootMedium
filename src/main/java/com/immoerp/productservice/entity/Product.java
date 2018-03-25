package com.immoerp.productservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Double price;
	private Integer availableInStock;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Product(String name, Double price, Integer availableInStock) {
		super();
		this.name = name;
		this.price = price;
		this.availableInStock = availableInStock;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", availableInStock=" + availableInStock + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getAvailableInStock() {
		return availableInStock;
	}
	public void setAvailableInStock(Integer availableInStock) {
		this.availableInStock = availableInStock;
	}
}
