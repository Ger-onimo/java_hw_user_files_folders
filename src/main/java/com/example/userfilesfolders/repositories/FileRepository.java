package com.example.userfilesfolders.repositories;

import com.example.userfilesfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository implements JpaRepository<File, Long> {
}
