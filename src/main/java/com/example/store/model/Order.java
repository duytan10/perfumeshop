package com.example.store.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @SequenceGenerator(
            name = "orders_sequence",
            sequenceName = "orders_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "orders_sequence"
    )
    private Integer order_id;
    private Integer customer_id;
    private Timestamp created_day;

    public Order() {
    }

    public Order(Integer order_id, Integer customer_id, Timestamp created_day) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.created_day = created_day;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Timestamp getCreated_day() {
        return created_day;
    }

    public void setCreated_day(Timestamp created_day) {
        this.created_day = created_day;
    }
}
