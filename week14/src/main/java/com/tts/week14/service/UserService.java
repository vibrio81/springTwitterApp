package com.tts.week14.service;

import com.tts.week14.model.User;


import java.util.List;

public interface UserService {
    User findByUsername(String username);
    List<User> findAll();
    void save(User user);
    User saveNewUser(User user);
    User getLoggedInUser();


}
