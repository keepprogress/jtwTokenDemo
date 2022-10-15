package com.nick.jwtTokenDemo.repo;

import com.nick.jwtTokenDemo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
