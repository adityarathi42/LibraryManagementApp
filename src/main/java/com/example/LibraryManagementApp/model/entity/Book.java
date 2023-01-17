package com.example.LibraryManagementApp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

@Table(name = "book", schema = "lms")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;

    private String bookName;

    @OneToMany(mappedBy = "book")
    private List<BookItem> bookItemList;


}
