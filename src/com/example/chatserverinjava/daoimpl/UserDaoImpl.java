/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chatserverinjava.daoimpl;

import com.example.chatserverinjava.dao.UserDao;
import com.example.chatserverinjava.entity.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HOME
 */
public class UserDaoImpl implements UserDao{
    
    private List<User> userList=new ArrayList<>();

    @Override
    public boolean insert(User user) {
           return userList.add(user);
    }

    @Override
    public List<User> getAll() {
        userList.add(new User(1,"Bibek","bibek","b@gmail.com",true));
         userList.add(new User(2,"Sangarsha","sanf","sang@gmail.com",true));
        return userList;
    }

    @Override
    public User login(String userName, String password) {

            for(User u :getAll())
            {
            if(u.getUserName().equalsIgnoreCase(userName)&& u.getPassword().equalsIgnoreCase(password))
            {
                return u;
            }
            }
            return null;
    }
    
}
