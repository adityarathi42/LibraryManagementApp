package com.example.LibraryManagementApp.serviceimpl;

import com.example.LibraryManagementApp.model.dto.LibraryUserDTO;
import com.example.LibraryManagementApp.model.entity.Admin;
import com.example.LibraryManagementApp.model.entity.LibraryUser;
import com.example.LibraryManagementApp.model.entity.Member;
import com.example.LibraryManagementApp.repository.LibraryUserRepository;
import com.example.LibraryManagementApp.repository.MemberRepository;
import com.example.LibraryManagementApp.service.UserService;
import com.example.LibraryManagementApp.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    LibraryUserRepository libraryUserRepository;

    @Override
    public void create(LibraryUserDTO libraryUserDTO) {
        if (libraryUserDTO.getIsAdmin()) {
            Admin admin = new Admin();
            admin.getLibraryUserFromDTO(libraryUserDTO);
            libraryUserRepository.save(admin);
        } else {
            Member member = new Member();
            member.getLibraryUserFromDTO(libraryUserDTO);
            member.setEndDate(Util.getEndDate());
            libraryUserRepository.save(member);
        }

    }
}
