package com.m2i.crm.service.impl;

import com.m2i.crm.model.Customer;
import com.m2i.crm.repository.CustomerRepository;
import com.m2i.crm.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerServiceInterface {

    @Autowired
    CustomerRepository repo;

    @Override
    public List<Customer> getAll() {
        return repo.findAll();
    }

    @Override
    public Customer getId(int id) throws Exception{
        return repo.findById(id).orElseThrow(Exception::new);
    }

    @Override
    public Customer createCustomer(Customer c) {
        return repo.save(c);
    }

    @Override
    public void deleteCustomer(int id) {
        repo.deleteById(id);
    }

    @Override
    public Customer updateCustomer(Customer c) throws Exception{
        Customer customer = repo.findById(c.getCustomer_id()).orElseThrow(Exception::new);
        customer.setCustomer_id(c.getCustomer_id());
        customer.setLastName(c.getLastName());
        customer.setFirstName(c.getFirstName());
        customer.setCompany(c.getCompany());
        customer.setEmail(c.getEmail());
        customer.setPhone(c.getPhone());
        customer.setMobile(c.getMobile());
        customer.setNotes(c.getNotes());
        customer.setActive(c.getActive());
        customer.setOrders(c.getOrders());
        return repo.save(customer);
    }
}
