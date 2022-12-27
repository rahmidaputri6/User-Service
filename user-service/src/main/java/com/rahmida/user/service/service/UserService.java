/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmida.user.service.service;

import com.rahmida.user.service.dto.User;
import java.util.List;

/**
 *
 * @author asus
 */
public interface UserService {

    public List<User> getAllUsers();

    public User getUser(String id);

    public void addUser(User user);

    public User updtateUser(User user);

    public User deleteUser(String id);
    
}
