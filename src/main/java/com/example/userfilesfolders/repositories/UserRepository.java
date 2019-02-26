package com.example.userfilesfolders.repositories;

import com.example.userfilesfolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
