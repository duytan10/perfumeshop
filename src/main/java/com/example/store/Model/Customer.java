package com.example.store.Model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customer_id;
    private String customer_name;
    private String email;
    private String address;
    private String phone;
    private Date dob;
    private String password;
    private String gender;
}
