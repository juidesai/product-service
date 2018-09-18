package com.solstice.orderservice.com.solstice.productservice.Repository;


import com.solstice.orderservice.com.solstice.productservice.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select product_price from product where product_id = ?1", nativeQuery = true)
    double getProductPricefromId(@Param("product_id") long product_id);
}
