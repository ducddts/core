package com.spring.jpa.demo.service;


import com.spring.jpa.demo.entity.User;

public interface IUserService {

  User findById(Long id);
  User findFirstByName(String name);
}
