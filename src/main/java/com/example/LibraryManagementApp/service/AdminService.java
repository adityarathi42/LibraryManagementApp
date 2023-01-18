package com.example.LibraryManagementApp.service;

import com.example.LibraryManagementApp.model.dto.BookDTO;
import com.example.LibraryManagementApp.model.entity.Book;
import com.example.LibraryManagementApp.model.entity.BookCategory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AdminService {
    void addBooks(List<Book> bookList);
    void addCategories(List<BookCategory> categoryList);
}
