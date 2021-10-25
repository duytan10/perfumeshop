package com.example.store.controller;

import com.example.store.model.Product;
import com.example.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable("productId")Integer productId) {
        return productService.getProductById(productId);
    }

    @PostMapping
    public void addNewProduct(@RequestBody Product product) {
        productService.addNewProduct(product);
    }

    @DeleteMapping(path = "{productId}")
    public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable("productId") Integer productId) {
        return productService.deleteProduct(productId);
    }

    @PutMapping(path = "{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable("productId") Integer productId, @RequestBody Product productDetails) {
        return productService.updateProduct(productId, productDetails);
    }
}
