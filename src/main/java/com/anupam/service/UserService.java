package com.anupam.service;

import java.util.List;
import java.util.Optional;

import com.anupam.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    Optional<User> findById(Long id);
}
