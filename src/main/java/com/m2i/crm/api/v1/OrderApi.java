package com.m2i.crm.api.v1;

import com.m2i.crm.model.Order;
import com.m2i.crm.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/order")
public class OrderApi {
    @Autowired
    private OrderServiceInterface service;
    @GetMapping(value="")
    public ResponseEntity<List<Order>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping(value= "/{id}")
    public ResponseEntity<Order> getId(@PathVariable("id") int id) throws Exception{
        Order order = service.getId(id);
        return (order == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(order);
    }
    @PostMapping(value ="")
    public ResponseEntity<Order> create(@RequestBody Order o){
        return new ResponseEntity<>(service.createOrder(o), HttpStatus.CREATED);
    }
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable("id") int id){
        service.deleteOrder(id);
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<Order> update(@RequestBody Order o) throws Exception{
        return new ResponseEntity<>(service.updateOrder(o), HttpStatus.OK);
    }
}
