package com.abdul_samet_cindilli.UserManagement.service;

import com.abdul_samet_cindilli.UserManagement.model.User;


import java.util.List;

public interface UserServiceImpl {

    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void delete(Long id);
}
