package com.m2i.crm.service;

import com.m2i.crm.model.Customer;

import java.util.List;

public interface CustomerServiceInterface {
    List<Customer> getAll();
    Customer getId(int id);
    Customer createCustomer(Customer c);
    void deleteCustomer(int id);
    Customer updateCustomer(Customer c);
}
