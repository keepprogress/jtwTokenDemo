package com.nick.jwtTokenDemo.service;

import com.nick.jwtTokenDemo.domain.Role;
import com.nick.jwtTokenDemo.domain.User;

import java.util.List;

public interface UserService {
    User savaUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
