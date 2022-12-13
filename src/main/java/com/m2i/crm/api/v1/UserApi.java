package com.m2i.crm.api.v1;

import com.m2i.crm.model.User;
import com.m2i.crm.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {
    @Autowired
    private UserServiceInterface service;

    @GetMapping(value="")
    public ResponseEntity<List<User>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    @GetMapping(value= "/{id}")
    public ResponseEntity<User> getId(@PathVariable("id") int id) throws Exception{
        User user = service.getId(id);
        return (user == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(user);
    }
    @PostMapping(value ="")
    public ResponseEntity<User> create(@RequestBody User u){
        return new ResponseEntity<>(service.createUser(u), HttpStatus.CREATED);
    }
    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable("id") int id) throws Exception{
        service.deleteUser(id);
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<User> update(@RequestBody User u) throws Exception{
        return new ResponseEntity<>(service.updateUser(u), HttpStatus.OK);
    }

}
