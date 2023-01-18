package com.example.LibraryManagementApp.repository;

import com.example.LibraryManagementApp.model.entity.BookItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookItemRepository extends JpaRepository<BookItem, Integer> {
}