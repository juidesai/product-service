package com.solstice.orderservice.com.solstice.productservice.Repository;


import com.solstice.orderservice.com.solstice.productservice.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
