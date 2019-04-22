package com.example.demo.com.example.service;

import com.example.demo.com.example.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, String> {


}
