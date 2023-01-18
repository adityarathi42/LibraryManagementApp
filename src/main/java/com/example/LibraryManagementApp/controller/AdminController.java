package com.example.LibraryManagementApp.controller;

import com.example.LibraryManagementApp.model.dto.BookDTO;
import com.example.LibraryManagementApp.model.dto.LibraryUserDTO;
import com.example.LibraryManagementApp.model.entity.Book;
import com.example.LibraryManagementApp.model.entity.BookCategory;
import com.example.LibraryManagementApp.service.AdminService;
import com.example.LibraryManagementApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping(value = "/add-books")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void addBooks(@RequestBody List<Book> bookList) {
        adminService.addBooks(bookList);
    }

    @PostMapping(value = "/add-categories")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void addCategories(@RequestBody List<BookCategory> categories) {
        adminService.addCategories(categories);
    }
}