package com.m2i.crm.repository;

import com.m2i.crm.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer>{
}
