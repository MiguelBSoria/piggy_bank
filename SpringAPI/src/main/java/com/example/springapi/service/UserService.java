package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private List<User> userLists;

    public UserService(List<User> userLists) {
        this.userLists = userLists;

        User user = new User(1,"Miguel","Bo So",21,"Miguel BoSo", "123", 1);

        userLists.add(user)
    }

    public User getUser(Integer id){
        for (User user: userLists){
            if (id == user.getId()){
                return user;
            }
        }
        return null;
    }
}
