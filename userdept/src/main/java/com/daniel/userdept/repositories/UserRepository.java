package com.daniel.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
