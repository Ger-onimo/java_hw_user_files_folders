package com.example.userfilesfolders.components;

import com.example.userfilesfolders.models.Folder;
import com.example.userfilesfolders.models.User;
import com.example.userfilesfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User gerry = new User("Gerry");
        userRepository.save(gerry);

        Folder topSecret = new Folder("Top Secret", gerry);
        folderRepository.save(topSecret);

    }
}
