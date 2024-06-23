package com.inventory.service;

import java.util.List;

import com.inventory.entity.Product;

public interface ProductService {
	
	List<Product>getAllProducts();

	//List<Product> searchProducts(String query);
	
   Product addProduct(Product product);
	  
  
	


}
