package com.m2i.crm.service.impl;

import com.m2i.crm.model.User;
import com.m2i.crm.repository.UserRepository;
import com.m2i.crm.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    UserRepository repo;

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getId(int id) {
        return repo.getReferenceById(id);
    }

    @Override
    public User createUser(User u) {
        return repo.save(u);
    }

    @Override
    public void deleteUser(int id) {
        repo.deleteById(id);
    }

    @Override
    public User updateUser(User u) {
        User user = repo.getReferenceById(u.getUser_id());
        repo.save(u);
        user.setUser_id(u.getUser_id());
        user.setMail(u.getMail());
        user.setGrants(u.getGrants());
        user.setPassword(u.getPassword());
        return user;
    }
}
