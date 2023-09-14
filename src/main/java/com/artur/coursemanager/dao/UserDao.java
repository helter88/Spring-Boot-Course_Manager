package com.artur.coursemanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artur.coursemanager.entity.User;


public interface UserDao extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
