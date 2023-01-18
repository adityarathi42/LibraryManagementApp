package com.example.LibraryManagementApp.model.entity;

import com.example.LibraryManagementApp.enums.UserType;
import com.example.LibraryManagementApp.model.entity.LibraryUser;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "member", schema = "lms")
@Data
@DiscriminatorValue(UserType.MEMBER)
public class Member extends LibraryUser {
    @Column(name = "issue_count", columnDefinition = "integer default 0")
    private int issueCount;

    @CreationTimestamp
    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;


}
