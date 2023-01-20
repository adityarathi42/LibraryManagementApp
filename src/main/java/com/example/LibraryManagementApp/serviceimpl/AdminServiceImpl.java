package com.example.LibraryManagementApp.serviceimpl;

import com.example.LibraryManagementApp.model.entity.Book;
import com.example.LibraryManagementApp.model.entity.BookCategory;
import com.example.LibraryManagementApp.model.entity.BookItem;
import com.example.LibraryManagementApp.repository.BookCategoryRepository;
import com.example.LibraryManagementApp.repository.BookItemRepository;
import com.example.LibraryManagementApp.repository.BookRepository;
import com.example.LibraryManagementApp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    BookItemRepository bookItemRepository;

    @Autowired
    BookCategoryRepository bookCategoryRepository;

    @Override
    public void addBooks(List<Book> bookList) {
        bookList.forEach(book -> {
            for(BookItem bookItem : book.getBookItemList()) {
                bookItem.setBook(book);
            }
        });
        bookRepository.saveAll(bookList);
    }

    @Override
    public void addCategories(List<BookCategory> categoryList) {
        bookCategoryRepository.saveAll(categoryList);
    }
}

