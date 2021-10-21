package com.example.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating")
public class Rating {
    @Id
    @Column(name = "ROWID")
    private String rowId;
    private Integer product_id;
    private Integer customer_id;
    @Column(name = "startpoint")
    private Integer start_point;
    private String rating_comment;

    public Rating() {
    }

    public Rating(Integer product_id, Integer customer_id, Integer start_point, String rating_comment) {
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.start_point = start_point;
        this.rating_comment = rating_comment;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getStart_point() {
        return start_point;
    }

    public void setStart_point(Integer start_point) {
        this.start_point = start_point;
    }

    public String getRating_comment() {
        return rating_comment;
    }

    public void setRating_comment(String rating_comment) {
        this.rating_comment = rating_comment;
    }
}
