package com.m2i.crm.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "customer_id", nullable = false)
    Integer customer_id;
    String lastName;
    String firstName;
    String company;
    String email;
    String phone;
    String mobile;
    String notes;
    Boolean active;
    @OneToMany(mappedBy="order_id")
    Set<Order> orders;
}
