package com.m2i.crm.service;


import com.m2i.crm.model.User;

import java.util.List;

public interface UserServiceInterface {
    List<User> getAll();
    User getId(int id);
    User createUser(User u);
    void deleteUser(int id);
    void updateUser(User u);
}
