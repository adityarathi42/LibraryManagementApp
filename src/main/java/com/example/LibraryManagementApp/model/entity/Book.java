package com.example.LibraryManagementApp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.StreamingHttpOutputMessage;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

@Table(name = "book", schema = "lms")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;

    private String bookName;

    @ManyToOne
    @JoinColumn(name = "book_category_id")
    private BookCategory bookCategory;

    private String author;

    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookItem> bookItemList;



}
