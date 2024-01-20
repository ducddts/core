package com.spring.jpa.demo.service.impl;

import com.spring.jpa.demo.entity.User;
import com.spring.jpa.demo.repository.UserRepository;
import com.spring.jpa.demo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

  private final UserRepository userRepository;

  @Override
  public User findById(Long id) {
    return userRepository.findById(id).orElseThrow();
  }

  @Override
  public User findFirstByName(String name) {
    return userRepository.findFirstByName(name).orElseThrow();
  }
}
