package com.example.store.service;

import com.example.store.model.Product;
import com.example.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public ResponseEntity<Product> getProductById(Integer productId) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalStateException("Product with id " + productId + " does not exists"));
        return ResponseEntity.ok(product);
    }

    public void addNewProduct(Product product) {
        productRepository.save(product);
    }

    public ResponseEntity<Map<String, Boolean>> deleteProduct(Integer productId) {
        boolean exists = productRepository.existsById(productId);
        if (!exists) {
            throw new IllegalStateException("Product with id " + productId + " does not exists");
        }

        productRepository.deleteById(productId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<Product> updateProduct(Integer productId, Product productDetails) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalStateException(
                        "Product with id " + productId + " does not exists"));

        if (productDetails.getProduct_name() != null && productDetails.getProduct_name().length() > 0 && !Objects.equals(product.getProduct_name(), productDetails.getProduct_name())) {
            product.setProduct_name(productDetails.getProduct_name());
        }

        if (productDetails.getTypeOfFragrance() != null && productDetails.getTypeOfFragrance().length() > 0 && !Objects.equals(product.getTypeOfFragrance(), productDetails.getTypeOfFragrance())) {
            product.setTypeOfFragrance(productDetails.getTypeOfFragrance());
        }

        if (productDetails.getProduct_size() != null && productDetails.getProduct_size().length() > 0 && !Objects.equals(product.getProduct_size(), productDetails.getProduct_size())) {
            product.setProduct_size(productDetails.getProduct_size());
        }

        if (productDetails.getDescription() != null && productDetails.getDescription().length() > 0 && !Objects.equals(product.getDescription(), productDetails.getDescription())) {
            product.setDescription(productDetails.getDescription());
        }

        if (productDetails.getProduct_images() != null && productDetails.getProduct_images().length() > 0 && !Objects.equals(product.getProduct_images(), productDetails.getProduct_images())) {
            product.setProduct_images(productDetails.getProduct_images());
        }

        if (productDetails.getProduct_price() != null && productDetails.getProduct_price() > 0 && !Objects.equals(product.getProduct_price(), productDetails.getProduct_price())) {
            product.setProduct_price(productDetails.getProduct_price());
        }

        if (productDetails.getCategory_id() != null && productDetails.getCategory_id() > 0 && !Objects.equals(product.getCategory_id(), productDetails.getCategory_id())) {
            product.setCategory_id(productDetails.getCategory_id());
        }

        if (productDetails.getFeatures_products() != null && !Objects.equals(product.getFeatures_products(), productDetails.getFeatures_products())) {
            product.setFeatures_products(productDetails.getFeatures_products());
        }

        Product updatedProduct = productRepository.save(product);
        return  ResponseEntity.ok(updatedProduct);
    }
}
