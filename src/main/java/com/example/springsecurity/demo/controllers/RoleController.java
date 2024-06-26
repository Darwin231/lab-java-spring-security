package com.example.springsecurity.demo.controllers;

import com.example.springsecurity.demo.model.Role;
import com.example.springsecurity.demo.service.impl.UserService;
import com.example.springsecurity.demo.service.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoleController{

    /**
     * User service for accessing user data
     */
    @Autowired
    private UserServiceInterface userServiceInterface;

    /**
     * Save a new role
     *
     * @param role role to be saved
     */
    @PostMapping("/roles")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveRole(@RequestBody Role role) {
        userServiceInterface.saveRole(role);
    }

    /**
     * Add a role to a user
     *
     * @param roleToUserDTO DTO containing the username and role name
     */
}
