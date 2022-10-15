package com.nick.jwtTokenDemo.repo;

import com.nick.jwtTokenDemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
