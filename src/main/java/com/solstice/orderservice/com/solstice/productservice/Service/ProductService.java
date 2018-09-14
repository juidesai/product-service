package com.solstice.orderservice.com.solstice.productservice.Service;

import com.solstice.orderservice.com.solstice.productservice.Domain.Product;
import com.solstice.orderservice.com.solstice.productservice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) { this.productRepository = productRepository;
    }

    public List<Product> getAllproducts() {
        return productRepository.findAll();
    }

    public void addNewProducts(Product product) {
        productRepository.save(product);
    }

}
