package com.example.userfilesfolders.components;

import com.example.userfilesfolders.models.File;
import com.example.userfilesfolders.models.Folder;
import com.example.userfilesfolders.models.User;
import com.example.userfilesfolders.repositories.FileRepository;
import com.example.userfilesfolders.repositories.FolderRepository;
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

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User gerry = new User("Gerry");
        userRepository.save(gerry);
        User ross = new User("Ross");
        userRepository.save(ross);


        Folder topSecret = new Folder("Top Secret", gerry);
        folderRepository.save(topSecret);
        Folder midSecret = new Folder("Mid Secret", gerry);
        folderRepository.save(midSecret);
        Folder bottomSecret = new Folder("Bottom Secret", gerry);
        folderRepository.save(bottomSecret);

        File sshhhh = new File("Sshhhh", "txt", 1400, topSecret );
        fileRepository.save(sshhhh);
        File needToKnow = new File("Need to Know", "txt", 100, topSecret );
        fileRepository.save(needToKnow);
        File delsPuns = new File("Del's Puns", "txt", 5000, midSecret );
        fileRepository.save(delsPuns);
        File  forAllEyes = new File("For All Eyes", "txt", 5000, bottomSecret );
        fileRepository.save(forAllEyes);

    }
}
