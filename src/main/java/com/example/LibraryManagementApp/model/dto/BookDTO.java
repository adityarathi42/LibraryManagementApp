package com.example.LibraryManagementApp.model.dto;

import com.example.LibraryManagementApp.model.entity.BookCategory;
import com.example.LibraryManagementApp.model.entity.BookItem;
import lombok.Data;

import java.util.List;

@Data
public class BookDTO {
    private String bookName;
    private BookCategory bookCategory;
    private String author;
    private List<BookItem> bookItemList;
}
