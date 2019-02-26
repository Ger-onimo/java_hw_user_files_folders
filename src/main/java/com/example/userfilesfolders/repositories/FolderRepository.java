package com.example.userfilesfolders.repositories;

import com.example.userfilesfolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
