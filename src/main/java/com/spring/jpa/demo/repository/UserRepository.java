package com.spring.jpa.demo.repository;

import com.spring.jpa.demo.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findFirstByName(String name);
}
