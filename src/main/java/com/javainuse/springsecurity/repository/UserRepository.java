package com.javainuse.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.springsecurity.model.DAOUser;


@Repository
public interface UserRepository extends JpaRepository<DAOUser, Long> {

}