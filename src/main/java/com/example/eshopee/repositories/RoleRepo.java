package com.example.eshopee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eshopee.entites.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

}
