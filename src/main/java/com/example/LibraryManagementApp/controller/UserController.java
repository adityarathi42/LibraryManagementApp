package com.example.LibraryManagementApp.controller;

import com.example.LibraryManagementApp.model.dto.LibraryUserDTO;
import com.example.LibraryManagementApp.model.entity.LibraryUser;
import com.example.LibraryManagementApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/register")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void create(@RequestBody LibraryUserDTO libraryUserDTO) {

        userService.create(libraryUserDTO);
    }
}
