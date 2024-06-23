package com.inventory.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventory.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	//List<Product> findByPnameContainingIgnoreCase(String query);

}
