package com.solstice.orderservice.com.solstice.productservice.Controller;

import com.solstice.orderservice.com.solstice.productservice.Domain.Product;
import com.solstice.orderservice.com.solstice.productservice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping(value = "/products/{productId}")
    public Optional<Product> getProductById(@PathVariable(name = "productId") long productId){
        return productRepository.findById(productId);
    }

    @GetMapping(value = "/productPrice/{productId}")
    public double getPricefromProductId(@PathVariable(name = "productId") long productId){
        return productRepository.getProductPricefromId(productId);
    }
}
