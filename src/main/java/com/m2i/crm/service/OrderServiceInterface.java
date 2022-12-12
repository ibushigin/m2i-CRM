package com.m2i.crm.service;


import com.m2i.crm.model.Order;

import java.util.List;

public interface OrderServiceInterface {
    List<Order> getAll();
    Order getId(int id);
    Order createOrder(Order o);
    void deleteOrder(int id);
    void updateOrder(Order o);
}
