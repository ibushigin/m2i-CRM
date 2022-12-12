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
    public Order getId(int id) throws Exception{
        return repo.findById(id).orElseThrow(Exception::new);
    }

    @Override
    public Order createOrder(Order o) {
        return repo.save(o);
    }

    @Override
    public void deleteOrder(int id) { repo.deleteById(id);}

    @Override
    public Order updateOrder(Order o) throws Exception{
        Order order = repo.findById(o.getOrder_id()).orElseThrow(Exception::new);
        order.setOrder_id(o.getOrder_id());
        order.setAdrEt(o.getAdrEt());
        order.setNumberOfDays(o.getNumberOfDays());
        order.setTva(o.getTva());
        order.setStatus(o.getStatus());
        order.setType(o.getType());
        order.setNotes(o.getNotes());
        order.setCustomer(o.getCustomer());
        return repo.save(order);
    }
}
