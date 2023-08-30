package com.abhi.SpringSecurityJWT.service;


import com.abhi.SpringSecurityJWT.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {


    private List<User> store = new ArrayList<>();
    public UserService(){

        store.add(new User(UUID.randomUUID().toString(),"abhi","abhi.singh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Raj","Raj.singh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ankit","Ankit.singh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Vivek","Vivek.singh@gmail.com"));


    }


    public List<User>  getUsers(){

        return  store;
    }

}
