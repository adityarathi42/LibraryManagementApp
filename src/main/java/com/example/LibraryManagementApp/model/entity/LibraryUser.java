package com.example.LibraryManagementApp.model.entity;

import com.example.LibraryManagementApp.model.dto.LibraryUserDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.net.openssl.ciphers.Encryption;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "library_user", schema = "lms")
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "user_type") // by default spring creates column named dtype if there are child entities
public class LibraryUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phoneNumber;

    public LibraryUser getLibraryUserFromDTO(LibraryUserDTO libraryUserDTO) {
        this.email = libraryUserDTO.getEmail();
        this.password = libraryUserDTO.getPassword();
        if(libraryUserDTO.getName() != null)
            this.name = libraryUserDTO.getName();
        if(libraryUserDTO.getPhoneNumber() != null)
            this.phoneNumber = libraryUserDTO.getPhoneNumber();

        return this;
    }
}
