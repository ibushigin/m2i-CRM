package com.m2i.crm.api.dto;

import com.m2i.crm.model.Order;
import lombok.Data;

import java.util.Set;

@Data
public class CustomerDto {
    Integer customer_id;
    String lastName;
    String firstName;
    String company;
    String email;
    String phone;
    String mobile;
    String notes;
    Boolean active;
    Set<Order> orders;
}
