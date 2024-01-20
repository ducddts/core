package com.spring.jpa.demo.controller;

import com.spring.jpa.demo.entity.User;
import com.spring.jpa.demo.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

  private final IUserService userService;

  @GetMapping("/{id}")
  public ResponseEntity<User> getById(@PathVariable Long id) {
    return ResponseEntity.ok(userService.findById(id));
  }

  @GetMapping("")
  public ResponseEntity<User> getFirstByName(@RequestParam String name) {
    return ResponseEntity.ok(userService.findFirstByName(name));
  }
}
