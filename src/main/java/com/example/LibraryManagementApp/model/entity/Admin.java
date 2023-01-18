package com.example.LibraryManagementApp.model.entity;

import com.example.LibraryManagementApp.enums.UserType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@NoArgsConstructor
@DiscriminatorValue(UserType.ADMIN)
public class Admin extends LibraryUser {

}
