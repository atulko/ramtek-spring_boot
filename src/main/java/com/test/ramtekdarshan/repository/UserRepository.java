package com.test.ramtekdarshan.repository;

import com.test.ramtekdarshan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
