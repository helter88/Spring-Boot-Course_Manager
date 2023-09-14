package com.artur.coursemanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artur.coursemanager.entity.Role;


public interface RoleDao extends JpaRepository<Role, Long> {
    
    Role findByName(String name);
}
