package com.example.LibraryManagementApp.repository;

import com.example.LibraryManagementApp.model.entity.LibraryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryUserRepository extends JpaRepository<LibraryUser, Integer> {
}