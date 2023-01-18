package com.example.LibraryManagementApp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "book_category", schema = "lms")
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(unique = true)
    String name;
}
