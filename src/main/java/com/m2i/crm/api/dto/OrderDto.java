package com.m2i.crm.api.dto;

import com.m2i.crm.model.Customer;
import lombok.Data;

@Data
public class OrderDto {
    Integer order_id;
    Double adrEt;
    Double numberOfDays;
    Double tva;
    String status;
    String type;
    String notes;
    Customer customer;
}
