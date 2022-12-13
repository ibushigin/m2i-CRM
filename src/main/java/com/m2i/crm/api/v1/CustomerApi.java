package com.m2i.crm.api.v1;

import com.m2i.crm.model.Customer;
import com.m2i.crm.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerApi {
    @Autowired
    private CustomerServiceInterface service;
    @GetMapping(value="")
    public ResponseEntity<List<Customer>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping(value= "/{id}")
    public ResponseEntity<Customer> getId(@PathVariable("id") int id) throws Exception{
        Customer customer = service.getId(id);
        return (customer == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(customer);
    }
    @PostMapping(value ="")
    public ResponseEntity<Customer> create(@RequestBody Customer c){
        return new ResponseEntity<>(service.createCustomer(c), HttpStatus.CREATED);
    }
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable("id") int id){
        service.deleteCustomer(id);
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<Customer> update(@RequestBody Customer c) throws Exception{
        return new ResponseEntity<>(service.updateCustomer(c), HttpStatus.OK);
    }

}
