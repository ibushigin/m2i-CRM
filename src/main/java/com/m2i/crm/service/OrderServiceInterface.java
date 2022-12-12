package com.m2i.crm.service;


import com.m2i.crm.model.Order;

import java.util.List;

public interface OrderServiceInterface {
    List<Order> getAll();
    Order getId(int id) throws Exception;
    Order createOrder(Order o);
    void deleteOrder(int id);
    Order updateOrder(Order o) throws Exception;
}
