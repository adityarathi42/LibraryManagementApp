package com.example.LibraryManagementApp.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class LibraryUserDTO {

    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private Boolean isAdmin;
}
