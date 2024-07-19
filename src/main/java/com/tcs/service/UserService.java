package com.tcs.service;

import com.tcs.entity.User;
import com.tcs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser() throws Exception {
        String imagePath="C:\\Users\\balu1\\OneDrive\\Desktop\\ChanduImage.jpg";

        User user=new User();
        user.setUserName("Chandra");
        user.setUserEmail("cmr.202116@gmail.com");
        long size = Files.size(Paths.get(imagePath));

        byte[] arr=new byte[(int) size];
        FileInputStream fis=new FileInputStream(new File(imagePath));
        fis.read(arr);
        fis.close();
        user.setUsr_Image(arr);
        userRepository.save(user);

    }

}
