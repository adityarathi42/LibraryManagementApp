package com.example.LibraryManagementApp.model.entity;

import com.example.LibraryManagementApp.enums.BookStatus;
import com.example.LibraryManagementApp.model.entity.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "book_item", schema = "lms")
public class BookItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer itemId;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(unique = true)
    String barcode;
    String rackNumber;
    BookStatus bookStatus;
}
