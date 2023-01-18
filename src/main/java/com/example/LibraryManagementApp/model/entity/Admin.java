package com.example.LibraryManagementApp.model.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@NoArgsConstructor
@DiscriminatorValue("Admin")
public class Admin extends LibraryUser {

}
