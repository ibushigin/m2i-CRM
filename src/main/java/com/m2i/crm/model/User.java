package com.m2i.crm.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id", nullable = false)
    Integer user_id;
    String password;
    String mail;
    String grants;
}
