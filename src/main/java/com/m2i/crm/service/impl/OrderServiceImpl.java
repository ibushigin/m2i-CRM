package com.m2i.crm.service.impl;

import com.m2i.crm.model.Order;
import com.m2i.crm.repository.OrderRepository;
import com.m2i.crm.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderServiceInterface {

    @Autowired
    OrderRepository repo;

    @Override
    public List<Order> getAll() {
        return repo.findAll();
    }

    @Override
    public Order getId(int id) {
        return repo.getReferenceById(id);
    }

    @Override
    public Order createOrder(Order o) {
        return repo.save(o);
    }

    @Override
    public void deleteOrder(int id) { repo.deleteById(id);}

    @Override
    public void updateOrder(Order o) { repo.save(o); }
}
