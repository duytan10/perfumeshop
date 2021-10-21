package com.example.store.Model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Integer product_id;
    private String product_name;
    private String typeOfFragrance;
    private String product_size;
    private String description;
    private String product_images;
    private Long product_price;
    private Integer category_id;
    private Boolean features_products;

    public Product() {
    }

    public Product(Integer product_id,
                   String product_name,
                   String typeOfFragrance,
                   String product_size,
                   String description,
                   String product_images,
                   Long product_price,
                   Integer category_id,
                   Boolean features_products) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.typeOfFragrance = typeOfFragrance;
        this.product_size = product_size;
        this.description = description;
        this.product_images = product_images;
        this.product_price = product_price;
        this.category_id = category_id;
        this.features_products = features_products;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getTypeOfFragrance() {
        return typeOfFragrance;
    }

    public void setTypeOfFragrance(String typeOfFragrance) {
        this.typeOfFragrance = typeOfFragrance;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_images() {
        return product_images;
    }

    public void setProduct_images(String product_images) {
        this.product_images = product_images;
    }

    public Long getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Long product_price) {
        this.product_price = product_price;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Boolean getFeatures_products() {
        return features_products;
    }

    public void setFeatures_products(Boolean features_products) {
        this.features_products = features_products;
    }
}
