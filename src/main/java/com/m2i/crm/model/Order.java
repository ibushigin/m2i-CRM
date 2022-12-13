package com.m2i.crm.model;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name ="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "order_id", nullable = false)
    Integer order_id;
    Double adrEt;
    Double numberOfDays;
    Double tva;
    String status;
    String type;
    String notes;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;
}
