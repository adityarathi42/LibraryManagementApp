package com.example.LibraryManagementApp.service;

import com.example.LibraryManagementApp.model.dto.LibraryUserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void create(LibraryUserDTO libraryUserDTO);

}
