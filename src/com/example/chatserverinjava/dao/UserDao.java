/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.chatserverinjava.dao;

import com.example.chatserverinjava.entity.User;
import java.util.List;

/**
 *
 * @author HOME
 */
public interface UserDao {
    
    boolean insert(User user);
    List<User> getAll();
    User login(String userName,String password);
}
