package com.inventory.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.inventory.entity.Product;
import com.inventory.repo.ProductRepo;

@Service
public class Productser implements ProductService{
	private ProductRepo productRepo;
	
	public Productser(ProductRepo productRepo) {  //constructor injection
		super();
		this.productRepo=productRepo;
		
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
		
	
	}

	@Override
	public Product addProduct(Product product) {
		
		System.out.println("product added");
		 // Assuming you have productService bean injected

		
		return productRepo.save(product);
	}




}
