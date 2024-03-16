package com.application.productsale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.access.prepost.PreAuthorize;

import com.application.productsale.model.Product;

public interface ProductServiceInterface {

	public List<Product> getAllProducts(Integer pageno, Integer pagesize);

	public Product getProductById(int id);

	public Product addProduct(Product product);

	public Product updateProduct(int id, Product product);

	public void deleteProduct(int id);
	
	public Double getRevenueByProduct(int id);

	public Double getTotalRevenue();

}
