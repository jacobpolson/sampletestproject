package com.application.productsale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.application.productsale.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer> {

	@Query(value = "select sum (quantity) from sale where productid=?1 group by productid", nativeQuery = true)
	int findSalesByProductId(int productid);

}
