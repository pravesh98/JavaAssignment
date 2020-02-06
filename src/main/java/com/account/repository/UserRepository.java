package com.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
